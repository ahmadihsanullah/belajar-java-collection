package programmer.zaman.now.kasus;

import java.util.*;

public class NavigableSetApp {
    public static void main(String[] args) {
        NavigableSet<Truck> truckPositions = new TreeSet<>(Comparator.comparing(Truck::getPosition));

        // Menambahkan posisi truck-truck ke dalam NavigableSet
        truckPositions.add(new Truck("Truck-1", 10));
        truckPositions.add(new Truck("Truck-2", 25));
        truckPositions.add(new Truck("Truck-3", 5));

        // Mencari truck terdekat berdasarkan posisi 12
        Truck nearestTruck = truckPositions.ceiling(new Truck("", 11));
        Truck nearestTruck2 = truckPositions.floor(new Truck("", 11));
        System.out.println("Truck terdekat dengan posisi 12: " + nearestTruck);
        System.out.println("Truck terdekat dengan posisi 12: " + nearestTruck2);
    }
}

class Truck {
    private String name;
    private int position;

    public Truck(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return name + " (Posisi: " + position + ")";
    }
}

