package pl.java7krk.kamillegutko;

import java.util.*;
import java.util.stream.Collectors;


public class MainFilter {
    public static void main(String[] args) {

        Person tomasz = new Person("Tomasz", "Zagrobelny", 16, 176);
        Person wojtek = new Person("Wojtek", "Pieronek", 21, 189);
        Person marek = new Person("Marek", "Tomaszek", 17, 188);
        Person iga = new Person("Iga", "Płonka", 18, 169);
        Person person5 = null;
        Person person6 = null;


        List<Person> personList = new ArrayList<>();
        personList.add(tomasz);
        personList.add(wojtek);
        personList.add(marek);
        personList.add(iga);

        List<Person> personList2 = personList.stream().filter(person -> person.getAge() >= 18)
                .filter(person -> person.getHeight() > 160)
                .collect(Collectors.toList());

//        Optional<Person> maybeTomasz = Optional.of(tomasz);
//        maybeTomasz.filter(person -> person.getAge() >= 18).filter(person -> person.getHeight() > 165)
//                .ifPresent(person -> System.out.println(person.getName() + " " + person.getSurname()));

    }

    static List<Person> filterPersons(List<Person> persons) {
        List<Person> result = new ArrayList<>();

        result.forEach(person -> {
            Optional<Person> maybeIsOk = Optional.of(person);
            maybeIsOk.filter(person1 -> person1.getAge() >= 18).filter(person1 -> person1.getHeight() > 165)
                    .ifPresent(person2 -> {
                        result.add(person2);
                        System.out.println(person2);
                    });
        });

//        for (Person p : persons) {
//            if (p.getAge() >= 18 && p.getHeight() > 130) {
//                result.add(p);
//            }
////            Optional<Person> maybeIsOk = Optional.of(p);
////            maybeIsOk.filter(person -> person.getAge() >= 18).filter(person -> person.getHeight() > 165)
////                    .ifPresent(person -> result.add(person));
//        }
        return result;
    }

}

