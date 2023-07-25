package programmer.zaman.now;

import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
    public static void main(String[] args) {
        //create anonymus classs
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        SortedMap<String, String> sortedMap = new TreeMap<>(comparator);
        sortedMap.put("ihsanullah", "Ihsanullah");
        sortedMap.put("ahmad", "Ahmad");
        sortedMap.put("rabbani", "Rabbani");

        for(var value: sortedMap.keySet()){
            System.out.println(value);
        }

        //mutable -> immutable
        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);
//        immutable.put("eko","Eko"); ERROR
    }
}
