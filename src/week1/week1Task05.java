package week1;

import java.util.Scanner;

public class week1Task05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        int number1 = sc.nextInt();
        System.out.println("Input 2st number: ");
        int number2 = sc.nextInt();


        if (number1 != number2) {
            int result;
            if (number1 > number2) {
                result = number1 - number2;
            } else {
                result = number1 + number2;
            }
            System.out.println("Result is: " + result);
        }
    }
}
