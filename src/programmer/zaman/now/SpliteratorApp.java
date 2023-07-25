package programmer.zaman.now;

import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SpliteratorApp {
    public static void main(String[] args) {
        List<String> list = List.of("Ahmad","Ihsanullah", "Rabbani","Pro","Gam","Er");

        Spliterator<String> spliterator1 = list.spliterator(); // 6 /2
        Spliterator<String> spliterator2 = spliterator1.trySplit(); // 3
        Spliterator<String> spliterator3 = spliterator2.trySplit(); // 3/2

        System.out.println(spliterator1.estimateSize());
        System.out.println(spliterator2.estimateSize());
        System.out.println(spliterator3.estimateSize());

        spliterator1.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        spliterator2.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}
