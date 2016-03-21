package homeworksWeek1;

import java.util.Scanner;

/**
 * Created by Heisenberg on 23.02.2016.
 */
public class Week1Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = sc.nextInt();

        if (number % 7 == 0) {
            System.out.println(number * 2);
        }
    }
}
