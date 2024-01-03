package programmer.zaman.now;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
//        ListExample<String> names = new LinkedList<>();

        names.add("Ahmad");
        names.add("Ihsanullah");
        names.add("Rabbani");
        names.add("Rabbani");
        names.add("Rabbani");
        names.set(2,"Rabbani");
        names.remove(1);
        names.remove("Rabbani");
        for(var value: names) {
            System.out.println(value);
        }
        names.add("Rabbani");
        var getIndex = names.lastIndexOf("Rabbani");
        System.out.println(getIndex);

        List<Integer> lIntegers = new LinkedList<>();
        lIntegers.add(1);
        lIntegers.add(2);
        lIntegers.add(3);
        lIntegers.set(0, 0);
        for(int number : lIntegers){
            System.out.println(number);
        }
    }
}
