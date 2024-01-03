package programmer.zaman.now;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("ahmad");
        names.add("hanif");
        names.add("Rabbani");
        names.add("iha");
        names.add("Rabbani");
        System.out.println(names.size());
        for(var name: names){
            System.out.println(name);
        }

        Set<String> hobbies = new LinkedHashSet<>();
        hobbies.add("read");
        hobbies.add("coding");
        hobbies.add("read");
        hobbies.forEach(
            item -> System.out.println(item)
        );
    }
}
