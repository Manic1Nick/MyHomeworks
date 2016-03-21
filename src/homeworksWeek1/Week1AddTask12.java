package homeworksWeek1;/* 12) Написать программу, которая в зависимости от характера ветра выдает
сообщение о его скорости от 1до 4 м/с - слабый (1); от 5-10 м/c -
умеренный (2); от 9-18 м/c - сильный (3); больше 19 м/c - ураганный (4).
*/

import java.util.Scanner;

public class Week1AddTask12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input wind speed im m/s:");
		int speed = sc.nextInt();
				
		if (speed >= 1 && speed <= 4) {
			System.out.println(1);
		} else {
			if (speed >= 5 && speed <= 10) {
				System.out.println(2);
			} else {
				if (speed >= 9 && speed <= 18) {
				System.out.println(3);
				} else {
					System.out.println(4);
				}
			}
		}
	}
}