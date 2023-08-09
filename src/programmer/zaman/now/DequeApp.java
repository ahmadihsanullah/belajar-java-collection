package programmer.zaman.now;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

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
        Queue<String> queue = new LinkedList<>();
        queue.offer("Ahmad");
        queue.offer("Ihsanullah");
        queue.offer("Rabbani");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }
}
