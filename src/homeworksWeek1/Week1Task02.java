package homeworksWeek1;

import java.util.Scanner;

public class Week1Task02 {

	public static void main(String[] args) {
		int max = 0;
		
		for (int i = 0; i < 3; i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Insert number");
			int number = scanner.nextInt();
			
			if (number > max) {
				max = number;
			}
		}
		System.out.print("Maximum number is " + max);
	}

}
