package homeworksWeek1;/* 5.2. Вычислить факториал числа.
*/

import java.util.Scanner;

public class Week1BigTask52 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input number:");
		int number = sc.nextInt();
		double numCur;
		double numLast;
		int numRes = 0;
		int numLastFact;

		for (int i = 0; i <= number;) {
			numCur = number / (Math.pow(10, i));

			if ((int)numCur != 0) {
				numLast = numCur % 10;
				numLastFact = 1;

				for (int f = 1; f <= (int)numLast;) {
					numLastFact *= f;
					f++;
				}
				numRes += numLastFact;
			}
			i++;
		}
		System.out.println("Factorial of " + number + " is " + numRes);
	}
}