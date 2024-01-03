package programmer.zaman.now.kasus;

import java.util.*;

public class SetExample {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 3, 2,12,121,21,21, 5, 6, 7, 7, 8 };
        Set<Integer> uniqueNumbers = new LinkedHashSet<>();
        for(var i : numbers){
            uniqueNumbers.add(i);
        }



        System.out.println("Array dengan elemen duplikat:");
        System.out.println(Arrays.toString(numbers));

        System.out.println("Array setelah menghapus elemen duplikat:");
        System.out.println(uniqueNumbers);
    }
}
