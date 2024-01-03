package programmer.zaman.now;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("ahmad");

        Set<String> mutable = new HashSet<String>();
        mutable.add("ahmad");
        mutable.add("ihsanullah");

        Set<String> immutable = Collections.unmodifiableSet(mutable);
        immutable.add("air");
        Set<String> elements = Set.of("Ahmad", "ihsan");
        //elements.add("rabbani"); //error
        //elements.remove("ahmad"); //error
    }
}
