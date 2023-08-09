package programmer.zaman.now;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        //put => create and update
        map.put("name.first","Ahmad");
        map.put("name.middle","Ihsanullah");
        map.put("name.last","Rabbani");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));

        Set<Map.Entry<String,String>> entries =map.entrySet();
        System.out.println(map.containsKey("name.last"));
        for(var entry : entries){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
