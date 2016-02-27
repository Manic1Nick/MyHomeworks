import java.util.Scanner;

public class week1AddTask02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number1:");
		int number1 = sc.nextInt();
		System.out.println("Input number2:");
		int number2 = sc.nextInt();
		System.out.println("Input number3:");
		int number3 = sc.nextInt();
		
		if (number1 > 0) {
			number1 = (int) Math.pow(number1, 3);
		} else {
			number1 = 0;
		}
		
		if (number2 > 0) {
			number2 = (int) Math.pow(number2, 3);
		} else {
			number2 = 0;
		}
		
		if (number3 > 0) {
			number3 = (int) Math.pow(number3, 3);
		} else {
			number3 = 0;
		}
		
		System.out.println(number1 + "\n" + number2 + "\n" + number3);
	}
}

	
	