package programmer.zaman.now;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name","Ahmad Ihsanullah Rabbani");
        map.put("age", "20");
        map.put("married", "false");

        Set<Map.Entry<String,String>> entries = map.entrySet();

        for (var entry : entries) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
