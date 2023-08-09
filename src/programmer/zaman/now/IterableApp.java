package programmer.zaman.now;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Ahmad", "Ihsanullah", "Rabbani");
        for(var name : names){
            System.out.println(name);
        }
        Iterator<String> iter = names.iterator();
        try {
            while(iter.hasNext()){
                String word = iter.next();
                if(word.equals("Rabbani")){
                    iter.remove();
                }
                System.out.println(word);
            }
        }catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
    }
}
