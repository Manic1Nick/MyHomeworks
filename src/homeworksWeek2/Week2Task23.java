package homeworksWeek2;

import java.util.Scanner;

/*2.3 Посчитать колличество букв 'a' в строке (искомый символ может быть разным)*/

public class Week2Task23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input some letters in line: ");
        String line = sc.next();
        System.out.println("Input letter: ");
        String letter = sc.next();

        int res = AddArrayUtils.countLetterInLine(line, letter);

        System.out.println("There are " + res + " letters in line");
    }
}
