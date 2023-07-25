package programmer.zaman.now.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;

    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<String>();
    }

    public void addHobby(String name) {
        hobbies.add(name);
    }

    public List<String> getHobbies(){
        return Collections.unmodifiableList(hobbies);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
