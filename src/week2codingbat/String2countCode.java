package week2codingbat;

/*Return the number of times that the string "code" appears anywhere
in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2*/

public class String2countCode {

    public static int countCode(String str) {

        int code = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
                code++;
            }
        }
        return code;
    }
}
