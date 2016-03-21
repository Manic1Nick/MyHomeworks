package homeworksWeek1;/* 15) Известны площади круга и квадрата. Определить: а) уместится ли круг в
квадрат; б) уместится ли квадрат в круге.
*/

import java.util.Scanner;

public class Week1AddTask15 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input circle area:");
		double areaCircle = sc.nextDouble();
		System.out.println("Input square area:");
		double areaSquare = sc.nextDouble();
		
		boolean resCircleInSquare = ((2 * (Math.sqrt(areaCircle / Math.PI))) <=
									(Math.sqrt(areaSquare)));
		boolean resSquareInCircle = (Math.sqrt((Math.sqrt(areaSquare) * 2))) <=
									(2 * (Math.sqrt(areaCircle / Math.PI)));
		
		System.out.println("The circle is placed in the square?\n" + resCircleInSquare + 
							"\nThe square is placed in the circle?\n" + resSquareInCircle);
	}
}