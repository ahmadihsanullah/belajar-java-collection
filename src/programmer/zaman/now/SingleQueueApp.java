package programmer.zaman.now;

import programmer.zaman.now.collection.SingleQueue;

import java.util.Queue;

public class SingleQueueApp {
    public static void main(String[] args) {
        Queue<String> singleQueue = new SingleQueue<>();
        System.out.println(singleQueue.size());

        System.out.println(singleQueue.offer("Ahmad"));
        System.out.println(singleQueue.offer("Ihsanullah"));
        System.out.println(singleQueue.offer("Rabbani"));

        System.out.println(singleQueue.size());

        System.out.println(singleQueue.peek());
        System.out.println(singleQueue.poll());
        System.out.println(singleQueue.poll());
        System.out.println(singleQueue.poll());
        System.out.println(singleQueue.peek());

        System.out.println(singleQueue.size());


    }

}
