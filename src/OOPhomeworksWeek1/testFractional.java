package OOPhomeworksWeek1;

import OOPhomeworksWeek1.model.FractionalNumber;

import java.util.Scanner;

public class testFractional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1st fractional number, ex. 3/5 or 4/7:");
        String fractNum1 = sc.next();
        System.out.println("Input 2nd fractional number, ex. 1/2 or 7/8:");
        String fractNum2 = sc.next();

        for (int i = 0; ; ) {
            System.out.println("\nInput sign of operation:\n" +
                    "\"+\" for addition\n" +
                    "\"-\" for subtraction\n" +
                    "\"*\" for multiplication\n" +
                    "\"/\" for division\n" +
                    "\"=\" for comparison\n" +
                    "\"_\" for fractional to line 1st number\n" +
                    "or input 0 for exit\n");
            String sign = sc.next();
            double res = 0;

            if (sign.equals("0")) {
                break;
            }

            if (sign.equals("+")) {
                String res1 = FractionalNumber.addition2Fractionals(fractNum1, fractNum2);
                System.out.print(fractNum1 + " " + sign + " " + fractNum2 + " = ");
                FractionalNumber.printFractional(res1);
            }

            if (sign.equals("-")) {
                String res2 = FractionalNumber.subtraction2Fractionals(fractNum1, fractNum2);
                System.out.print(fractNum1 + " " + sign + " " + fractNum2 + " = ");
                FractionalNumber.printFractional(res2);
            }

            if (sign.equals("*")) {
                String res3 = FractionalNumber.multiplication2Fractionals(fractNum1, fractNum2);
                System.out.print(fractNum1 + " " + sign + " " + fractNum2 + " = ");
                FractionalNumber.printFractional(res3);
            }

            if (sign.equals("/")) {
                String res4 = FractionalNumber.division2Fractionals(fractNum1, fractNum2);
                System.out.print(fractNum1 + " " + sign + " " + fractNum2 + " = ");
                FractionalNumber.printFractional(res4);
            }

            if (sign.equals("_")) {
                double res5 = FractionalNumber.fractionalToLine(fractNum1);
                System.out.print(fractNum1 + " in line is: " + res5);
            }

            if (sign.equals("=")) {
                boolean res6 = FractionalNumber.comparison2Fractionals(fractNum1, fractNum2);
                System.out.println(fractNum1 + " bigger than " + fractNum2 + " ?\n" + res6);
            }

        }
    }
}
