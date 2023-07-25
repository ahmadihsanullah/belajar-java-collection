package programmer.zaman.now;

import java.util.*;
import java.util.function.BiConsumer;

public class MapDefaultMethodApp {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("foo", "bar");
        map.put("bar", "foo");
        map.put("ruu", "bar");




        //perulangan menggunak forEach bukan entrie untuk mendapatkan key dan valuenya
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " = " + value);
            }
        });

        map.replace("ruu", "bar", "bro");
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " = " + value);
            }
        });

        System.out.println(map.remove("ruu","bro"));

        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " = " + value);
            }
        });

    }
}
