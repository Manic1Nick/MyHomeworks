package homeworksWeek1;/* 9) Написать программу вычисления идеального веса пользователя (рост-
100). Выдать рекомендации о необходимости поправиться либо поху-
деть.
*/

import java.util.Scanner;

public class Week1AddTask09 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your growth in m:");
		double growth = sc.nextDouble();
		System.out.println("Input your weight in kg:");
		int weight = sc.nextInt();
		
		double idealWeight = growth * 100 - 100;
		if ((weight - idealWeight) > 0) {
			System.out.println("You need to lose weight at " + (weight - idealWeight) + " kg");
		} else {
			if ((weight - idealWeight) < 0) {
				System.out.println("You need to gain weight at " + (idealWeight - weight) + " kg");
			} else {
				System.out.println("Congratulation! You have ideal weight!");
			}
		}
	}
}