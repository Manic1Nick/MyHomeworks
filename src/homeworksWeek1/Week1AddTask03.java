package homeworksWeek1;/* 3) Дано трехзначное число. Определить: а) верно ли, что все его цифры
одинаковые; б) есть ли среди его цифр одинаковые.
 */

import java.util.Scanner;

public class Week1AddTask03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number from 100 to 999:");
		int number = sc.nextInt();

		if (number < 100 || number > 999) {
			System.out.println("Number must be from 100 to 999 !!!");
		} else {
			int number1 = number % 10;
			int number2 = (number / 10) % 10;
			int number3 = number / 100;

			boolean resAllTheSame = (number1 == number2 && number1 == number3);
			boolean resTwoTheSame = (number1 == number2 || number1 == number3 || number2 == number3);

			System.out.println("All numbers are the same?\n" + resAllTheSame);
			System.out.println("Are the same numbers there?\n" + resTwoTheSame);
		}
	}
}

	
	