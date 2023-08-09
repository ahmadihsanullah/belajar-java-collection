package programmer.zaman.now.kasus;

import java.util.ArrayList;
import java.util.List;

public class ListReverse {

    public static <T> List<T> reverseWithoutNewArrayList(List<T> list) {
        for(var i = 0; i < list.size() / 2; i++) {
            var temp = list.get(i);
            list.set(i, list.get(list.size() - i - 1));
            list.set(list.size() - i - 1, temp);
        }
        return list;
    }

    public static <T> List<T> reverseWithNewArrayList(List<T> list) {
        List<T> result = new ArrayList<>(list);

        for(var i = 0; i < list.size() / 2; i++) {
            var temp = list.get(i);
            result.set(i, list.get(list.size() - i - 1));
            result.set(list.size() - i - 1, temp);
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        List<Integer> reverseList = reverseWithNewArrayList(list);
        System.out.println(reverseList);
    }
}
