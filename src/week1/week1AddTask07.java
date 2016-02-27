package week1;

import java.util.Scanner;

public class week1AddTask07 {
	
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