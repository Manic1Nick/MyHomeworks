import java.util.Scanner;

public class week1AddTask05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number a:");
		int a = sc.nextInt();
		System.out.println("Input number b:");
		int b = sc.nextInt();
		System.out.println("Input number c:");
		int c = sc.nextInt();
		
		boolean resSameNumbers = (a == b || b == c || a == c);
			System.out.println("Are the same numbers there?\n" + resSameNumbers);

	}
}

	
	