package homeworksWeek3;

import artcodeUtils.StringUtils;

import java.util.Scanner;

/*3.7. Найти самое длинное слово в строке(разделенное одним пробелом)*/

public class Week3Task37 {

    public static void main(String[] args) {
        String line = StringUtils.enterStringLine();
        StringUtils.findMaxWordInLine(line);
    }

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
        System.out.println("\nMust bigger word is \"" + word + "\"");
        return word;
    }
}
