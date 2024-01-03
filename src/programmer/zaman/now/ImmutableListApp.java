package programmer.zaman.now;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListApp {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("one");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<String>();
        mutable.add("ahmad");
        mutable.add("ihsan");
        mutable.set(0, "Ahmad");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("a","b","c");
    }
}
