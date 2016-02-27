import java.util.Scanner;

public class week1AddTask10 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input day of the week from 1 to 7:");
		int dayOfTheWeek = sc.nextInt();
		System.out.println("Input call duration in min:");
		int callDuration = sc.nextInt();
		double priceOfMin = 1.00;
		double callCost;
		
		if (dayOfTheWeek < 1 || dayOfTheWeek > 7) {
			System.out.println("Day of the week must be from 1 to 7 !!!");
		} else {
			if (dayOfTheWeek > 0 && dayOfTheWeek < 6 ) {
				callCost = callDuration * priceOfMin;
			} else {
				callCost = callDuration * priceOfMin * 0.80;
			} 
			System.out.println("Call cost is $" + callCost);
		}
	}
}