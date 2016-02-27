package week1;

import java.util.Scanner;

public class week1Task06 {
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
