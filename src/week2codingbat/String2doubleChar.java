package week2codingbat;

/*Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"*/

public class String2doubleChar {

    public static String doubleChar(String str) {
        String b = "";
        for (int i = 0; i < str.length(); i++) {
            String a = str.substring(i, i + 1);
            b = b + a + a;
        }
        return b;
    }
}
