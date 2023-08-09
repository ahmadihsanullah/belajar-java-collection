package programmer.zaman.now.kasus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListWithLambda {
    public static void main(String[] args) {
        // Membuat daftar angka
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(3);
        numbers.add(15);

        // Mengurutkan daftar angka menggunakan lambda
        Collections.sort(numbers, (a, b) -> a.compareTo(b));

        // Menampilkan daftar angka yang sudah diurutkan
        System.out.println("Daftar angka setelah diurutkan:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
