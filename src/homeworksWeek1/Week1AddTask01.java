package homeworksWeek1;/* 1) Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
лить, является ли он прямоугольным. Ответ вывести в виде сообщения. */

import java.util.Scanner;

public class Week1AddTask01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input side1 of triangle:");
		int a = sc.nextInt();
		System.out.println("Input side2 of triangle:");
		int b = sc.nextInt();
		System.out.println("Input side3 of triangle:");
		int c = sc.nextInt();

		a *= a;
		b *= b;
		c *= c;

		boolean resTriangleRect = (a == (b + c)) || (b == (a + c)) || (c == (a + b));

		System.out.println("Is triangle rectangular?\n" + resTriangleRect);
	}
}

	
	