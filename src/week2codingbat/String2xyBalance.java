package week2codingbat;

/*We'll say that a String is xy-balanced if for all the 'x' chars in the string,
there exists a 'y' char somewhere later in the string.
So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
Return true if the given string is xy-balanced.

xyBalance("aaxbby") → true
xyBalance("aaxbb") → false
xyBalance("yaaxbb") → false*/

public class String2xyBalance {

    public static boolean xyBalance(String str) {

        for (int i = str.length(); i >= 0; i--) {
            if (i > 0) {
                if (str.substring(i-1, i).equals("x")) {
                    return false;
                } else {
                    if (str.substring(i-1, i).equals("y")) {
                        return true;
                    }
                }
            } else {
                if (!str.substring(i).equals("x")) {
                    return true;
                }
            }
        }
        return false;
    }
}
