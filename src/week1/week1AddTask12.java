package week1;

import java.util.Scanner;

public class week1AddTask12 {
	
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