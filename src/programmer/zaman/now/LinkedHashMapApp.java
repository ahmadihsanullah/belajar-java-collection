package programmer.zaman.now;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<String, String>();

        map.put("first", "Ahmad");
        map.put("middle", "Ihsanullah");
        map.put("last", "Rabbani");


        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
