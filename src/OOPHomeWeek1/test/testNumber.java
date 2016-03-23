package OOPHomeWeek1.test;

import OOPHomeWeek1.util.NumberUtils;

import java.util.Scanner;

public class testNumber {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number1 for operation:");
        double num1 = sc.nextDouble();
        System.out.println("Input number2 for operation:");
        double num2 = sc.nextDouble();

        for (int i = 0; ; ) {
            System.out.println("Input sign of operation:\n" +
                    "\"+\" for addition\n" +
                    "\"-\" for subtraction\n" +
                    "\"*\" for multiplication\n" +
                    "\"/\" for division\n" +
                    "or input 0 for exit\n");
            String sign = sc.next();
            double res = 0;

            if (sign.equals("0")) {
                break;
            }

            if (sign.equals("+")) {
                res = NumberUtils.additionNum1Num2(num1, num2);
            }

            if (sign.equals("-")) {
                res = NumberUtils.subtractionNum1Num2(num1, num2);
            }

            if (sign.equals("*")) {
                res = NumberUtils.multiplicationNum1Num2(num1, num2);
            }

            if (sign.equals("/")) {
                res = NumberUtils.divisionNum1Num2(num1, num2);
            }

            System.out.println(num1 + " " + sign + " " + num2 + " = " +
                                NumberUtils.roundDouble(res, 4) + "\n");
        }
    }
}