package programmer.zaman.now;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {
        //tumpukan
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Ihsanullah");
        stack.offerLast("Ahmad");
        stack.offerLast("Rabbani");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        //antrian
        Deque<String> queue = new LinkedList<>();
        queue.offerLast("Ahmad");
        queue.offerLast("Ihsanullah");
        queue.offerLast("Rabbani");

        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
}
