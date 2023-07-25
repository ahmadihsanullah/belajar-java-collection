package programmer.zaman.now;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapApp {
    public static enum Level{
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<>(Level.class);

        map.put(Level.FREE, "Gratis");
        map.put(Level.STANDARD, "Bayar");

        System.out.println(map.get(Level.FREE));
        System.out.println(map.get(Level.STANDARD));

    }
}
