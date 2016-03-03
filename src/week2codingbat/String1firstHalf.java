package week2codingbat;

/*Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"*/

public class String1firstHalf {

    public static String firstHalf(String str) {

        String half = str.substring(0, str.length() / 2);

        return half;
    }
}
