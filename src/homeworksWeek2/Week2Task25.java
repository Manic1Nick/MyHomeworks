package homeworksWeek2;

import java.util.Scanner;

/*2.5 Заменить в строке все символы 'a' на '@' и вывести новую строку
    // "array is a data type" -> "@rr@y is @ d@t@ type"*/

public class Week2Task25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input some letters in line with letter a: ");
        String line = sc.next();

        String res = AddArrayUtils.replaceAllA(line);

        System.out.println(line);
    }
}
