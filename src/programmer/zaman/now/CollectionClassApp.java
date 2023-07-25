package programmer.zaman.now;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClassApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(10);

        list.addAll(List.of("a", "b", "c", "d","z","e","b"));

        System.out.println(list);

        //reverse
        Collections.reverse(list);
        System.out.println(list);

        //ngacak isi list
        Collections.shuffle(list);
        System.out.println(list);

        //get element with same object
        int number = Collections.frequency(list, "b");
        System.out.println(number);

        //get max element in list
        String nilai = Collections.max(list);
        System.out.println(nilai);

        //get min element in list
        String nilai2 = Collections.min(list);
        System.out.println(nilai2);

        List<String> listPertama = new ArrayList<>();
        listPertama.add("a");
        listPertama.add("b");
//        listPertama.add("c");
//        listPertama.add("a");
//        listPertama.add("b");
//        listPertama.add("c");

        List<String> listKedua = new ArrayList<>();
        listKedua.add("x");
        listKedua.add("y");
        listKedua.add("z");

        // Salin elemen dari list pertama ke list kedua
        Collections.copy(listKedua, listPertama);

        System.out.println("ListExample Pertama: " + listPertama);
        System.out.println("ListExample Kedua: " + listKedua);
    }
}
