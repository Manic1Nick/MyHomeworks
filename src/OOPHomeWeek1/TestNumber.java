package OOPHomeWeek1;

import java.util.Scanner;

public class TestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; ; i++) {

            System.out.println("\n\nInput int number or push 0 for exit:");
            int test1 = sc.nextInt();

            if (test1 == 0) {
                break;
            }

            Number number = new Number(test1);
            System.out.println("Input next int number:");
            Number num2 = new Number(sc.nextInt());

            System.out.print("\nT e s t i n g    l i s t   " + (i + 1) + ":\n");

            if (number.test(number, num2) == true) {
                System.out.print("\nCongratulation! Test was successful");
            } else {
                System.out.print("\nLook above for search mistakes");
            }
        }
    }
}