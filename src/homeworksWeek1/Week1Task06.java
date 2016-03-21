package homeworksWeek1;

import java.util.Scanner;

/**
 * Created by Heisenberg on 23.02.2016.
 */
public class Week1Task06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        int number1 = sc.nextInt();
        System.out.println("Input 2st number: ");
        int number2 = sc.nextInt();
        int sumNumbers = number1 + number2;

        if (sumNumbers >= 11 && sumNumbers <= 19) {
            System.out.println("Result is: " + sumNumbers);
        }
    }
}
