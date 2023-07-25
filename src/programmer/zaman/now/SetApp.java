package programmer.zaman.now;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        Set<String> names = new LinkedHashSet<>();
        names.add("Rabbani");
        names.add("Rabbani");
        System.out.println(names.size());
        for(var name: names){
            System.out.println(name);
        }
    }
}
