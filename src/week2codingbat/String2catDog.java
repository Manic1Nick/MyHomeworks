package week2codingbat;

/*Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true*/

public class String2catDog {

    public static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                cat++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                dog++;
            }
        }
        if (cat == dog) {
            return true;
        } else {
            return false;
        }
    }
}
