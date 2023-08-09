package programmer.zaman.now;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Ahmad","Ihsanullah","Rabbani","Budi","Cahyadi"));
        
        //reverse
        NavigableSet<String> reverse = names.descendingSet();
        for (var name : reverse) {
//            System.out.println(name);
        }


        //bounded to ahmad-Budi
        NavigableSet<String> budi = names.headSet("Budi",true);
        //bounded to rabbani-Budi from tail
        NavigableSet<String> budiTail = names.tailSet("Budi",true);
        for (var name : budiTail) {
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        immutable.add("Aji"); //ERROR
    }
}
