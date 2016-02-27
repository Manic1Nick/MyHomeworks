package week1;/* 5.3. Посчитать сколько раз встречается символ 8 в заданном числе, которое вводит юзер
			5678  -   1
			5889  -   2
			8888  -   4
			989990  - 1
*/

import java.util.Scanner;

public class week1BigTask53 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number:");
		int number = sc.nextInt();
		double numCurrent = 1;
		double numLast;
		int numRes = 0;
				
		for (int i = 0; i <= number;) {
			if (numCurrent != 0) {
				numCurrent = number / (Math.pow(10, i));
				numLast = numCurrent % 10;
				if ((int) numLast == 8) {
					numRes++;
				}
			}
			i++;
		}
		System.out.println("8 in number: " + numRes);
	}
}