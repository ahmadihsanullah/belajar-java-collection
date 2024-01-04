package programmer.zaman.now;

import programmer.zaman.now.data.Person;
import programmer.zaman.now.data.PersonComparator;

import java.util.*;

public class SortedSetApp {
    public static void main(String[] args) {
        Comparator<Person> comparator = (Person o1,Person o2) -> o1.getName().compareTo(o2.getName());

        Person person2 = new Person("umi");
        person2.addHobby("memasak");
        Person person1 = new Person("abi");
        person1.addHobby("membaca");
        SortedSet<Person> hobbiesPerson = new TreeSet<>((o1, o2)-> o1.getName().compareTo(o2.getName()));
        hobbiesPerson.add(person1);
        hobbiesPerson.add(person2);
        hobbiesPerson.forEach(
            item->System.out.println(item)
        );

        SortedSet<Person> people = new TreeSet<>(comparator);
        people.add(new Person("Ahmad"));
        people.add(new Person("Ihsan"));
        people.add(new Person("Davi"));
        for(var person : people) {
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
//        sortedSet.add(new Person("rabbani")); ERROR
//        System.out.println(people.toString());

        //sortedSet ini String
        SortedSet<String> names = new TreeSet<>();
        names.add("hanif");
        names.add("ahmad");
        names.add("rafi");
        names.add("davi");
        names.forEach(
            item -> System.out.println(item)
        );

        SortedSet<Person> sortedSetUnModifiable = Collections.unmodifiableSortedSet(people);
        sortedSetUnModifiable.add(new Person("rehan"));
        names.subSet("davi", "rafi").forEach(
            item -> System.out.println(item)
        );

    }
}
