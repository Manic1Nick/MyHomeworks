package artcodeUtils;

import java.util.Scanner;

public class StringUtils {

    /*Ввод строки стринг с консоли*/

    public static String enterStringLine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input some words in the line: ");
        String line = sc.nextLine();
        return line;
    }

    /*Поиск максимально длинного слова в строке, разделенного пробелом*/

    public static String findMaxWordInLine(String line) {

        String word = new String();
        String[] lineParts = line.split(" ");

        for (int i = 0; i < lineParts.length; i++) {
            word = lineParts[i].length() > word.length() ? lineParts[i] : word ;
        }
        return word;
    }

    /*Изменить начальную букву в каждом слове строки на заглавную*/

    public static String upperFirstLetterInEachWord(String line) {

        String[] lineParts = line.split(" ");
        String res = "";

        for (int i = 0; i < lineParts.length; i++) {
            lineParts[i] = lineParts[i].substring(0, 1).toUpperCase() +
                    lineParts[i].substring(1, lineParts[i].length());
            res += lineParts[i] + " ";
        }
        return res;
    }

    /*Поиск и удаление слов которые повторяются*/

    public static String deleteSameWordsInLine(String line) {

        String[] lineParts = line.split(" ");
        String res = new String();

        for (int i = 0; i < lineParts.length; i++) {
            for (int j = i + 1; j < lineParts.length; j++) {
                if (lineParts[i].length() == lineParts[j].length()) {
                    lineParts[j] = lineParts[i].substring(0, lineParts[i].length()).equals
                            (lineParts[j].substring(0, lineParts[j].length())) ? "" : lineParts[j] ;
                }
            }
            if (lineParts[i] != "") {
                res += lineParts[i] + " ";
            }
        }
        return res;
    }




    public static boolean checkPassLength(String pass, int minLength, int maxLength) {

        int length = pass.length();
        boolean res = length >= minLength && length <= maxLength;
        if (res == false) {
            System.out.println("Password must be from 8 to 20 symbols!");
        }
        return res;
    }

    public static boolean checkPassLowerUpper(String pass) {

        boolean res = (!pass.equals(pass.toLowerCase()) &&
                       !pass.equals(pass.toUpperCase())) ? true : false ;
        if (res == false) {
            System.out.println("Password must have lower and upper letters!");
        }
        return res;
    }

    public static boolean checkPassNumbersIncl(String pass) {

        int length = pass.length();

        for (int i = 0; i < 10; i++) {
            String x = i + "";
            boolean res = (pass.substring(0, length).contains(x)) ? true : false ;
            if (res == true) {
                return res;
            }
        }
        System.out.println("Password must have numbers!");
        return false;
    }

    public static boolean checkPassWordsIncl(String pass) {

        int length = pass.length();
        boolean res = (!pass.contains("password") || !pass.contains("pass") || !pass.contains("gfhjkm")) ? true : false ;
        if (res == false) {
            System.out.println("Password must not have words 'password', 'pass', 'gfhjkm'!");
        }
        return res;
    }

    public static String genRandomPass() {

        int length = (int) (Math.random() * 12 + 8);
        String pass = "";

        String possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < length; j++) {
                pass += possible.charAt((int)Math.floor(Math.random() * possible.length()));
            }

            if (StringUtils.checkPassNumbersIncl(pass) == false) {
                i = 0;
            }
        }
        return pass;
    }


}
