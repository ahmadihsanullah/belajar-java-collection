package programmer.zaman.now;

import programmer.zaman.now.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {
        Person person = new Person("Ahmad");
        person.addHobby("Read");
        person.addHobby("Coding");
        person.addHobby("Badminton");

//        doSomethingWithHobbies(person.getHobbies());
        for(var value: person.getHobbies()){
            System.out.println(value);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("Bukan hoby");
    }
}
