package programmer.zaman.now;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {
        List<String> list = new Vector<>();
        list.add("Ahmad");
        list.add("Ihsanullah");
        list.add("Rabbani");

        for (var value : list) {
            System.out.println(value);
        }
    }
}
