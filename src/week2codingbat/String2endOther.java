package week2codingbat;

/*Given two strings, return true if either of the strings appears
at the very end of the other string, ignoring upper/lower case differences
(in other words, the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true*/

public class String2endOther {

    public static boolean endOther(String a, String b) {

        String smaller = "";
        String endBigger = "";

        if (a.length() > b.length()) {
            smaller = b.toLowerCase();
            endBigger = (a.toLowerCase()).substring((a.length() - b.length()), a.length());

        } else {
            smaller = a.toLowerCase();
            endBigger = (b.toLowerCase()).substring((b.length() - a.length()), b.length());
        }

        if (smaller.equals(endBigger)) {
            return true;
        }
        return false;
    }
}
