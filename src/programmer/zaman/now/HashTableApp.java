package programmer.zaman.now;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {
        Map<String, String> values = new Hashtable<>();

        values.put("nama", "Ihsan");
        values.put("umur", "20");
        values.put("hobi", "Ngoding");

        for(var value : values.entrySet()) {
            System.out.println(value.toString());
        }
    }
}
