package programmer.zaman.now;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchApp {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>(1000);

        for (int i = 1; i <= 1000. ; i++) {
            numbers.add(i);
        }

        //melakukan pencarian dengan binary search dengan cara memotong setengah2
        int index = Collections.binarySearch(numbers, 287);
        System.out.println(index);

        //menggunakan comparator : descending
        Comparator<Integer> comparator = new Comparator<>(){

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        int index2 = Collections.binarySearch(numbers, 287);
        System.out.println(index2);

    }

}
