package OOPHomeWeek1;

import java.util.Scanner;

public class TestFractional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; ; i++) {

            System.out.println("\n\nInput fractional number (ex. 2/5) " +
                                 "\nor push 0 for exit:");
            String test1 = sc.next();

            if (test1.equals("0")) {
                break;
            }

            Fractional number = new Fractional(UtilsFractional.findNumerator(test1),
                                                UtilsFractional.findDenominator(test1));
            System.out.println("Input next fractional number:");
            String test2 = sc.next();
            Fractional num2 = new Fractional(UtilsFractional.findNumerator(test2),
                                                UtilsFractional.findDenominator(test2));

            System.out.print("\nT e s t i n g    l i s t   " + (i + 1) + ":\n");

            if (Fractional.test(number, num2) == true) {
                System.out.print("\nCongratulation! Test was successful");
            } else {
                System.out.print("\nLook above for search mistakes");
            }
        }
    }

}
