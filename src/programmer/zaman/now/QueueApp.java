package programmer.zaman.now;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
//        Queue<String> queue = new ArrayDeque<>();
        Queue<String> queue = new PriorityQueue<>();
        //menggunakan priorityqueue agar data langsung terurut

        queue.add("Rabbani");
        queue.add("Ahmad");
        queue.add("Ihsanullah");

        //pool -> mengambil dan menghapus data, return null jika sudah kosong
        for(String i = queue.poll(); i != null; i = queue.poll()) {
            System.out.println(i);
        };

    }
}
