package week2codingbat;

/*Given a string, return a version without the first and last char,
so "Hello" yields "ell". The string length will be at least 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"*/

public class String1withoutEnd {

    public static String withoutEnd(String str) {

        String center = str.substring(1, str.length() - 1);

        return center;
    }
}
