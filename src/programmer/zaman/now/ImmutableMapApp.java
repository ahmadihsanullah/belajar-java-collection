package programmer.zaman.now;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name","Ihsan");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("first", "Ahmad");
        mutable.put("middle", "Ihsanullah");

        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "first", "Ahmad",
                "middle", "Ihsanullah",
                "last", "Rabbani"
        );

//        map.put("a","a"); ERROR : UnsupportedOperationException

    }
}
