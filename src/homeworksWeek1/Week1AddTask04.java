package homeworksWeek1;/* 4) Известны две скорости, одна в километрах в час, другая в метрах в секун-
ду. Какая из них больше?
*/

import java.util.Scanner;

public class Week1AddTask04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input speed in km/h:");
        int speedKmH = sc.nextInt();
        System.out.println("Input speed in m/s:");
        int speedMS = sc.nextInt();

        if ((speedKmH * 1000 / 3600) > speedMS) {
            System.out.println("The speed in km/h is higher");
        } else {
            System.out.println("The speed in m/s is higher");
        }

    }
}

	
	