package homeworksWeek1;/* 14) Определить, является ли шестизначное число "счастливым" (сумма
первых трех цифр равна сумме последних трех цифр).
*/

import java.util.Scanner;

public class Week1AddTask14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input six-digit number:");
		int number = sc.nextInt();
		
		if (number < 100000 || number >= 999999) {
			System.out.println("Number must be six-digit !!!");
		} else {
			int number1 = number % 10;
			int number2 = (number / 10) % 10;
			int number3 = (number / 100) % 10;
			int number4 = (number / 1000) % 10;
			int number5 = (number / 10000) % 10;
			int number6 =  number / 100000;
			
			boolean resHappy = (number1 + number2 + number3) == (number4 + number5 + number6);
			System.out.println("This number is happy?\n" + resHappy);
		}		
	}
}