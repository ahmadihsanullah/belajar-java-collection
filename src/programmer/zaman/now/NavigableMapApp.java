package programmer.zaman.now;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<>();

        navigableMap.put("eko","eko");
        navigableMap.put("joko","joko");
        navigableMap.put("budi","budi");

        for(var name: navigableMap.keySet()){
//            System.out.println(name);
        }

        System.out.println(navigableMap.lowerKey("eko"));
        System.out.println(navigableMap.higherKey("eko"));


        //descending navigable map
        NavigableMap<String, String> navDescendingMap = navigableMap.descendingMap();
        for(var name: navDescendingMap.keySet()){
//            System.out.println(name);
        }

    }
}
