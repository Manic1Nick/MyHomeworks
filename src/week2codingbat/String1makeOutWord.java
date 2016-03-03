package week2codingbat;

/*Given an "out" string length 4, such as "<<>>", and a word,
return a new string where the word is in the middle of the out string,
e.g. "<<word>>". Note: use str.substring(i, j)
to extract the String starting at index i and going up to but not including index j.

makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"*/

public class String1makeOutWord {

    public static String makeOutWord(String out, String word) {
        String s1 = out.substring(0, 2);
        String s2 = out.substring(2);

        return s1 + word + s2;
    }
}
