package homeworksWeek1;/* 4.8. Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
			124    4    -   true
			1456   567  -   false
			1      2    -   false
			18     98   -   true */

import java.util.Scanner;

public class Week1Task08 {
	
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

	
	