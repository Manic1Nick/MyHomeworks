package week1;

import java.util.Scanner;

public class week1AddTask13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number A:");
		int A = sc.nextInt();
		System.out.println("Input number B:");
		int B = sc.nextInt();
		System.out.println("Input number C:");
		int C = sc.nextInt();
				
		if ((A + B + C) > 0) {
			A = A * 2;
			B = B * 2;
			C = C * 2;
		} else {
			A = 0;
			B = 0;
			C = 0;
		}
		System.out.println("A = " + A + "\nB = " + B + "\nC = " + C);
	}
}