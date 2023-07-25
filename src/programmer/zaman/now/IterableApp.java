package programmer.zaman.now;

import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Ahmad", "Ihsanullah", "Rabbani");
        for(var name : names){
            System.out.println(name);
        }
    }
}
