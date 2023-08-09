package programmer.zaman.now.kasus;

import java.time.LocalTime;
import java.util.*;

public class FlightApp {
    /**Misalkan Anda bekerja di aplikasi perjalanan dan
    perlu menyimpan daftar penerbangan beserta waktu keberangkatan mereka.
    Anda ingin dapat mencari penerbangan terdekat berdasarkan waktu keberangkatan yang diberikan.*/
    public static void main(String[] args) {
        NavigableMap<LocalTime, String> flightSchedule = new TreeMap<>();

        // Menambahkan jadwal penerbangan ke dalam NavigableMap
        flightSchedule.put(LocalTime.of(8, 30), "Penerbangan A");
        flightSchedule.put(LocalTime.of(12, 45), "Penerbangan B");
        flightSchedule.put(LocalTime.of(15, 0), "Penerbangan C");

        // Mencari penerbangan terdekat berdasarkan waktu keberangkatan 14:30
        Map.Entry<LocalTime, String> nearestFlightEntry = flightSchedule.floorEntry(LocalTime.of(14, 30));
        System.out.println("Penerbangan terdekat pada " + nearestFlightEntry.getKey() + ": " + nearestFlightEntry.getValue());
    }
}
