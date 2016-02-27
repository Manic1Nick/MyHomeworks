package week1;

import java.util.Scanner;

public class week1Task08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 1st number:");
		int number1 = sc.nextInt();
		System.out.println("Input 2st number:");
		int number2 = sc.nextInt();
		
		boolean result = number1 % 10 == number2 % 10;
		System.out.println(result);
		
	}
}

	
	