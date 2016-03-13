package homeworksWeek3;

import artcodeUtils.StringUtils;

import java.util.Scanner;

/*3.8. Верхний регистр.
		Напишите программу, которая позволяет пользователю ввести в консоли строку,
		переводит первый символ слов в верхний регистр и результат выводит в консоль
		Вход:
		иван васильевич
		Выход:
		Иван Васильевич*/

public class Week3Task38 {

    public static void main(String[] args) {

        String line = StringUtils.enterStringLine();
        StringUtils.upperFirstLetterInEachWord(line);
    }

    public static String enterStringLine() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input some words in the line: ");
        String line = sc.nextLine();
        return line;
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
