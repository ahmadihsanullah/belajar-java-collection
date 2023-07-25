package programmer.zaman.now;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ToArrayApp {
    public static void main(String[] args) {
        List<String> names = List.of("ahmad","ihsanullah", "rabbani");

        //konversi ke object
        Object[] objects = names.toArray();
        //konversi ke array
        String[] array = names.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(array));
    }
}
