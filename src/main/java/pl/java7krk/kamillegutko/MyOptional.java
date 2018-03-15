package pl.java7krk.kamillegutko;

import java.util.Optional;
import java.util.function.Consumer;

class MyConsumer implements Consumer<Adress> {

    @Override
    public void accept(Adress myAdress) {
        System.out.println(myAdress);
    }
}

public class MyOptional {

    Optional<Person> person = Optional.empty();


    public static void main(String[] args) {

        Adress myAdress = new Adress("Polska", "Kraków", "Floriańska");
        Adress nullAdress = null;
        Optional<Adress> optionalAdress = Optional.empty();
        Optional<Adress> secondOptionaladress = Optional.ofNullable(myAdress);
        //Optional<Adress> thirdOptionaladress = Optional.of(nullAdress);

        //System.out.println("first: " + optionalAdress.get());

        if (optionalAdress.isPresent()) {
            System.out.println("first" + optionalAdress.get());
        } else {
            System.out.println("first: " + "Nie podano aderesu");
        }

        System.out.println("second: " + secondOptionaladress);

        optionalAdress.ifPresent(new MyConsumer());// tego nie wydrukuje, bo optional jest pusty
        secondOptionaladress.ifPresent(new MyConsumer());

        Consumer<Adress> myCons = new Consumer<Adress>() {
            @Override
            public void accept(Adress myAdress) {
                System.out.println("klasa anonimowa drukuje: " + myAdress);
            }
        };
        secondOptionaladress.ifPresent(myCons);
        optionalAdress.ifPresent(myCons ); // tu nic nie wydrukuje, bo przy null ifPresent nic nie drukuje

        secondOptionaladress.ifPresent(adress -> System.out.println(secondOptionaladress));
    }

}
