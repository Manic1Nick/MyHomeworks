package week2codingbat;

/*Given two strings, a and b, create a bigger string made
of the first char of a, the first char of b, the second char of a,
the second char of b, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"*/

public class String2mixString {

    public static String mixString(String a, String b) {

        String c = "";

        if (a.length() > b.length()) {
            for (int i = 0; i < b.length(); i++) {
                c = c + (a.substring(i, i+1) + b.substring(i, i+1));
            }
            for (int i = b.length(); i < a.length(); i++) {
                c = c + (a.substring(i, i+1));
            }

        } else {
            for (int i = 0; i < a.length(); i++) {
                c = c + a.substring(i, i+1) + b.substring(i, i+1);
            }
            if ((b.length() - a.length()) != 0) {
                for (int i = a.length(); i < b.length(); i++) {
                    c = c + (b.substring(i, i+1));
                }
            } else {
                return c;
            }
        }
        return c;
    }
}
