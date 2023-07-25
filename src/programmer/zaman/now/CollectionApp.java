package programmer.zaman.now;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<String>();
        //add data
        names.add("Ahmad");
        names.add("Ihsanullah");
        names.addAll(List.of("Ahmad", "Ihsanullah", "Rabbani", "abc","def"));

        for(var name: names){
            System.out.println(name);
        }

        //remove data
        names.remove("Ahmad");
        names.remove("Rabbani");
        names.removeAll(Arrays.asList("Ahmad", "Ihsanullah"));
        System.out.println("-------remove data-------");
        for(var name: names){
            System.out.println(name);
        }

        //mengecek data dicollections
        System.out.println("-------check data-------");
        System.out.println(names.contains("Ahmad"));
        System.out.println(names.contains("abc"));
        //CONTAINSALL => SEMUA DATA HARUS ADA
        System.out.println(names.containsAll(Arrays.asList("def", "abc")));

        System.out.println(names.size());
    }
}
