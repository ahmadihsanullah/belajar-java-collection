package programmer.zaman.now.kasus;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambahkan elemen di depan deque.");
            System.out.println("2. Tambahkan elemen di belakang deque.");
            System.out.println("3. Hapus elemen dari depan deque.");
            System.out.println("4. Hapus elemen dari belakang deque.");
            System.out.println("5. Tampilkan semua elemen dalam deque.");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan bilangan bulat untuk ditambahkan di depan: ");
                    int frontElement = scanner.nextInt();
                    deque.addFirst(frontElement);
                    break;
                case 2:
                    System.out.print("Masukkan bilangan bulat untuk ditambahkan di belakang: ");
                    int rearElement = scanner.nextInt();
                    deque.addLast(rearElement);
                    break;
                case 3:
                    if (!deque.isEmpty()) {
                        int removedFrontElement = deque.removeFirst();
                        System.out.println("Elemen " + removedFrontElement + " dihapus dari depan.");
                    } else {
                        System.out.println("Deque kosong. Tidak ada elemen yang dapat dihapus dari depan.");
                    }
                    break;
                case 4:
                    if (!deque.isEmpty()) {
                        int removedRearElement = deque.removeLast();
                        System.out.println("Elemen " + removedRearElement + " dihapus dari belakang.");
                    } else {
                        System.out.println("Deque kosong. Tidak ada elemen yang dapat dihapus dari belakang.");
                    }
                    break;
                case 5:
                    if (!deque.isEmpty()) {
                        System.out.println("Elemen dalam deque:");
                        for (Integer num : deque) {
                            System.out.print(num + " ");
                        }
                        System.out.println();
                    } else {
                        System.out.println("Deque kosong. Tidak ada elemen dalam deque.");
                    }
                    break;
                case 6:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih opsi 1-6.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}
