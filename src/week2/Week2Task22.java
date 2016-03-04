package week2;

import java.util.Scanner;

/*2.2 Проверить или является число простым*/

public class Week2Task22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = sc.nextInt();

        AddArrayUtils.numberPrimeOrNot(number);
    }
}
