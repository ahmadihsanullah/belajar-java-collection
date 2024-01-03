package programmer.zaman.now;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetApp {

    public static enum Gender {
        FEMALE("Female"), MALE("Male");

        private final String genderValue;

        private Gender(String genderValue) {
            this.genderValue = genderValue;
        }

        public String getGenderValue() {
            return genderValue;
        }
    }

    public static void main(String[] args) {
        Set<Gender> genders = EnumSet.of(Gender.FEMALE, Gender.MALE);

        for (var gender : genders) {
            System.out.println(gender + ": " + gender.getGenderValue());
        }
    }
}
