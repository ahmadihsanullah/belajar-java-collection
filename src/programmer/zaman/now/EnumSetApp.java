package programmer.zaman.now;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {
    public static enum Gender{
        FEMALE, MALE
    }

    public static void main(String[] args) {
        Set<Gender> genders = EnumSet.of(Gender.FEMALE);

        for(var gender : genders){
            System.out.println(gender);
        }

    }
}
