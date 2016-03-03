package week2codingbat;

/*Given a string, return the string made of its first two chars,
so the String "Hello" yields "He". If the string is shorter than length 2,
return whatever there is, so "X" yields "X",
and the empty string "" yields the empty string "".
Note that str.length() returns the length of a string.

firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"*/

public class String1firstTwo {

    public static String firstTwo(String str) {

        if (str.length() >= 2) {
            String start = str.substring(0, 2);
            return start;
        } else {

            if (str.length() == 0) {
                return "";
            }

            String start = str.substring(0, 1);
            return start;
        }
    }

}
