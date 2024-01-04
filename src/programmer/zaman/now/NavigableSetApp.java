package programmer.zaman.now;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Ahmad","Ihsanullah","Rabbani","Budi","Cahyadi"));
        
        //reverse
        System.out.println("DESCENDING");
        NavigableSet<String> reverse = names.descendingSet();
        for (var name : reverse) {
           System.out.println(name);
        }


        //bounded to Ahmad-Budi
        System.out.println("\nAhmad-Budi");
        NavigableSet<String> budi = names.headSet("Budi",true);
        budi.forEach(
            item->System.out.println(item)
        );
        //bounded to Ahmad-Budi-Cahyadi, Ihsanullahnya tidak kebawa
        NavigableSet<String> Ihsanullah = names.headSet("Ihsan",true);
        System.out.println("\nAhmad-Budi dengan headset");
        Ihsanullah.forEach(
            item->System.out.println(item)
        );

        //bounded with subsed
        System.out.println("\nsubset: Budi - Cahyadi");
        SortedSet<String> budiCahyadi = names.subSet("Budi", "Ihsanullah");
        budiCahyadi.forEach(System.out::println);

        //bounded to Budi-Cahyadi-Ihsanullah-Rabbani from tail
        System.out.println("\nBudi-Cahyadi-Ihsanullah-Rabbani");
        NavigableSet<String> budiTail = names.tailSet("Budi",true);
        for (var name : budiTail) {
            System.out.println(name);
        }

        //cealing elements
        System.out.println("\nceiling elements");
        System.out.println(names.ceiling("Cah"));

        //higher elements
        System.out.println("\nhigher elements");
        System.out.println(names.higher("Budi"));

        System.out.println("---ceiling----");
        String result = names.ceiling("Ihsan"); // Output: Ihsanullah
        System.out.println(result);

        System.out.println("\n---floor----");
        result = names.floor("Cahya"); // Output: Budi
        System.out.println(result);

        System.out.println("\n---higher----");
        result = names.higher("Budi"); // Output: Cahyadi
        System.out.println(result);

        System.out.println("\n---lower----");
        result = names.lower("Budi"); // Output: Cahyadi
        System.out.println(result);

        System.out.println("\nbefore pool");
        names.forEach(System.out::println);

        System.out.println("\n---poolFIrst and poolLast----");
        String firstElement = names.pollFirst(); // Output: Ahmad (dan menghapusnya dari set)
        String lastElement = names.pollLast(); // Output: Rabbani (dan menghapusnya dari set)

        System.out.println(firstElement);
        System.out.println(lastElement);

        System.out.println("\nafter pool");
        names.forEach(System.out::println);


        //dari depan ke element yang ditentukan
        NavigableSet<String> headSet = names.headSet("Ihsanullah", true); 
        System.out.println("\n---headset---");
        headSet.forEach(System.out::println);
        
        //dari element ke belakang
        NavigableSet<String> tailSet = names.tailSet("Budi", false);
        System.out.println("\n---tailset---");
        tailSet.forEach(System.out::println);

        //dari element ke element
        names.add("Budi");
        NavigableSet<String> subSet = names.subSet("Budi", true, "Ihsanullah", false);
        System.out.println("\n---subSet----");
        subSet.forEach(System.out::println);



    }   
}
