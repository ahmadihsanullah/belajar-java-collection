package programmer.zaman.now.kasus;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListDeleteDuplicatedData {
    public static  <T> List<T> removeDuplicate(List<T> inputList) {
        List<T> uniqueList = new ArrayList<>();

        for(var list : inputList) {
            if(!uniqueList.contains(list)) {
                uniqueList.add(list);
            }
        }
        return uniqueList;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);

        List<Integer> uniqueNumbers = removeDuplicate(numbers);
        for(var number : uniqueNumbers){
            System.out.println(number);
        }
    }
}
