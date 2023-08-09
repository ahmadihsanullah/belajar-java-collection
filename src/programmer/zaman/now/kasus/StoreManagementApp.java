package programmer.zaman.now.kasus;
import java.util.*;

public class StoreManagementApp {
    //Misalkan Anda memiliki aplikasi manajemen toko dan perlu menyimpan daftar barang-barang beserta harganya.
    // Anda ingin memastikan barang-barang ini selalu diurutkan berdasarkan nama barang.
    public static void main(String[] args) {
        SortedMap<String, Integer> itemPrices = new TreeMap<>();

        // Menambahkan barang-barang ke dalam SortedMap
        itemPrices.put("Celana", 250000);
        itemPrices.put("Kemeja", 150000);
        itemPrices.put("Sepatu", 500000);

        // Menampilkan barang-barang yang diurutkan berdasarkan nama barang
        itemPrices.forEach((String key, Integer value) -> System.out.println(key + " : Rp." + value));
    }
}
