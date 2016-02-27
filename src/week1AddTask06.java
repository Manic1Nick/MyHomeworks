import java.util.Scanner;

public class week1AddTask06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Input speed in km/h:");
		double speed = sc.nextDouble();
		System.out.println("Input distance in km:");
		double distance = sc.nextDouble();

		double timeMinutesAll = distance / speed * 60;
		double timeHours = timeMinutesAll / 60;
		double timeMinutes = timeMinutesAll - ((int) timeHours * 60);

		System.out.println("The time is: " + (int) timeHours + " h " + (int) timeMinutes + " min");
	}
}

	
