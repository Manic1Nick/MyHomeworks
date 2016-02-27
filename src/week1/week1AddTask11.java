package week1;

import java.util.Scanner;

public class week1AddTask11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number from 1 to 99:");
		int number = sc.nextInt();
				
		if (number < 1 || number > 99) {
			System.out.println("Number must be from 1 to 99 !!!");
		} else {
			if ((number != 11) && ((number == 1) || (number % 10 == 1))) {
				System.out.println(number + " копейка");
			} else {
				if (number != 12 && number != 13 && number != 14 && 
				   ((number == 2) || (number == 3) || (number == 4) ||
				   (number % 10 == 2) || (number % 10 == 3) || (number % 10 == 4 ))) {
					System.out.println(number + " копейки");
				} else {
					System.out.println(number + " копеек");
				}
			}

		}
	}
}