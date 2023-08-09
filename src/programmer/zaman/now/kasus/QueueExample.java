package programmer.zaman.now.kasus;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Masukkan nama pelanggan (atau 'selesai' untuk keluar):");
            String customerName = scanner.nextLine();

            if (customerName.equalsIgnoreCase("selesai") ) {
                break;
            }

            customerQueue.add(customerName);
        }

        System.out.println("Daftar pelanggan dalam antrian:");

        while (!customerQueue.isEmpty()) {
            String nextCustomer = customerQueue.poll();
            System.out.println(nextCustomer);
        }

        scanner.close();
    }
}
