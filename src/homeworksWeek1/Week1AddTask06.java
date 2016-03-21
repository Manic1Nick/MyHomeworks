package homeworksWeek1;/* 6) У вас есть скорость и растояние, за какое время вы приедете в пукт назначения
*/

import java.util.Scanner;

public class Week1AddTask06 {

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

	
