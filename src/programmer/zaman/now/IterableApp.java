package programmer.zaman.now;

import java.util.Iterator;
import java.util.List;

public class IterableApp {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Ahmad", "Ihsanullah", "Rabbani","ahmad");
//         for(var name : names){
//             if(name.equals("Rabbani")){
// //                System.out.print("");
//                 break;
//             }
// //            System.out.println(name);
//         }
        Iterator<String> iter = names.iterator();
        try {
            while(iter.hasNext()){
                String word = iter.next();
                if(word.equals("Rabbani")){
                    continue;
                }
                System.out.println(word);
            }
        }catch(UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }
    }
}
