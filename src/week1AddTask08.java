import java.util.Scanner;

public class week1AddTask08 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your purchase amount:");
		double amount = sc.nextDouble();
		
		if (amount > 1000) {
			amount = amount * 0.90;
			System.out.println("Your purchase amount with 10% discount is: " + amount);
		} else {
			System.out.println("Sorry, you don't have a discount :(");
		}
	}
}