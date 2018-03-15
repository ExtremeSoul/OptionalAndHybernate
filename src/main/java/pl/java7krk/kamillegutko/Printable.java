package pl.java7krk.kamillegutko;

public interface Printable { // do interfejsu można napisać lambde tylko wtedy jak ma jedną metodę abstrakcyjną,
    // może mieć więcej, ale te musza być defaltowe
    String showName();

    default String getSurname() {
        return "Legutko";
    }

}

interface StringCalculator {
    int calculateLenght(String a, String b);
}

interface Calculable {

    int addArgs(int a, int b);

    default int substrateArgs(int a, int b) {
        return a - b;
    }

}

class PrintablePerson implements Printable {
    // @Override //Nadpisujemy metodę z nadklasy dzięki temu .
    public String showName() {
        return "Kamil";
    }
}

class Main {
    public static void main(String[] args) {
        Printable person = new PrintablePerson();
        Printable person2 = new Printable() { //klasa wirtualna, coś pośredniego przed lambdami
            @Override
            public String showName() {
                return "not Kamil";
            }

            public String showSurname() {//tego nie mozemy wykorzystac, bo nie mamy tego w klasie najwyzszym
                return "Legutko";
            }
        };
        person2.showName();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                System.out.println("Kamil to ja");
            }
        };

        Runnable run2 = () -> {
            System.out.println("My first lambda");
        };

        run2.run();

        Printable printable1 = () -> {
            return "Kamil";
        };

        Calculable calculable = (a, b) -> a + b;
        Calculable calculable2 = (a, b) -> {
            int c = a + b;
            System.out.println(c);
            return a + b;
        };
        System.out.println(calculable.addArgs(8, 3));
        calculable2.addArgs(2, 6);
        // Lamda to jest obiekt w którym zaimplementowaliśmy metodę. Główny architrekt JAVY tak twierdzi

        StringCalculator stringCalculator = (a, b) -> {
            int lenght = a.length() + b.length();
            System.out.println(lenght);
            return a.length() + b.length();

        };
        stringCalculator.calculateLenght("uysgggwgdec", "iuwechwechiwhceiuhwiuhciuhwiuhciuwhciuh");
    }
}