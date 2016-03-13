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
        System.out.println("\nMust bigger word is " + word);
        return word;
    }

    /*Изменить начальную букву в каждом слове строки на заглавную и вывести на печать*/

    public static void upperFirstLetterInEachWord(String line) {

        String[] lineParts = line.split(" ");

        for (int i = 0; i < lineParts.length; i++) {
            lineParts[i] = lineParts[i].substring(0, 1).toUpperCase() +
                    lineParts[i].substring(1, lineParts[i].length());
            System.out.print(lineParts[i] + " ");
        }
    }




}
