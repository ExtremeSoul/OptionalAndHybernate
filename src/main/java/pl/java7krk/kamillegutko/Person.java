package pl.java7krk.kamillegutko;

public class Person {

    private String name;
    private String surname;
    private int age;
    private int height;


    public Person(String name, String surname, int age, int height) {

        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
