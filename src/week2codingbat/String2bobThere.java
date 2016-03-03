package week2codingbat;

/*Return true if the given string contains a "bob" string,
but where the middle 'o' char can be any char.

bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false*/

public class String2bobThere {

    public static boolean bobThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i+1).equals("b") &&
                    str.substring(i+2, i+3).equals("b")) {
                return true;
            }
        }
        return false;
    }
}
