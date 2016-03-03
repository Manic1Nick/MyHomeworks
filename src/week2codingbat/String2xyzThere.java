package week2codingbat;

/*Return true if the given string contains an appearance of "xyz"
where the xyz is not directly preceeded by a period (.). S
o "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true*/

public class String2xyzThere {

    public static boolean xyzThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (i == 0) {
                if (str.substring(i, i + 3).equals("xyz")) {
                    return true;
                }
            } else {
                if (str.substring(i, i + 3).equals("xyz")) {
                    if (str.substring(i - 1, i).equals(".")) {
                        i++;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
