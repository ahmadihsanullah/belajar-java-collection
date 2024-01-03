package programmer.zaman.now;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapApp {
    public static enum Level {
        FREE("ini free"),
        STANDARD("ini standar"),
        PREMIUM("ini premium"),
        VIP("ini vip");

        private String description;

        Level(String description) {
            this.description = description;
        }


    }

    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<>(Level.class);

        map.put(Level.FREE, Level.FREE.description);
        map.put(Level.STANDARD, Level.STANDARD.description);

        System.out.println(map.get(Level.FREE));
        System.out.println(map.get(Level.STANDARD));

    }
}
