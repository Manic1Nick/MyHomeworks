package homeworksWeek1;/* 7) Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
времени года. Если пользователь введет недопустимое число, программа
должна выдать сообщение об ошибке.
*/

import java.util.Scanner;

public class Week1AddTask07 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number from 1 to 12:");
		int number = sc.nextInt();
		
		if (number <1 || number > 12) {
			System.out.println("Error! Number must be from 1 to 12 !!!");
		} else {
			if (number > 2 && number < 6) {
				System.out.println("It's spring!");
			} else {
				if (number > 5 && number < 9) {
					System.out.println("It's summer!");
				} else {
					if (number > 8 && number < 12) {
						System.out.println("It's autumn!");
					} else {
					System.out.println("It's winter!");
					}
				}
			}
		}	
	}
}