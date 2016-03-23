package OOPHomeWeek1.test;

import OOPHomeWeek1.model.Fractional;
import OOPHomeWeek1.util.FractionalUtils;

import java.util.Scanner;

public class testFractional {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input Fractional 1 in format n/n:");
        String fract1 = sc.next();
        System.out.println("Input Fractional 2 in format n/n:");
        String fract2 = sc.next();

        Fractional fractNum1 = new Fractional(FractionalUtils.findNumerator(fract1),
                                              FractionalUtils.findDenominator(fract1));
        Fractional fractNum2 = new Fractional(FractionalUtils.findNumerator(fract2),
                                              FractionalUtils.findDenominator(fract2));

        for (int i = 0; ; ) {
            System.out.println("\nInput sign of operation:\n" +
                    "\"+\" for addition\n" +
                    "\"-\" for subtraction\n" +
                    "\"*\" for multiplication\n" +
                    "\"/\" for division\n" +
                    "\"=\" for comparison\n" +
                    "\"_\" for print fractional 1 in line\n" +
                    "or input 0 for exit\n");
            String sign = sc.next();
            Fractional res = new Fractional(0, 1);

            if (sign.equals("0")) {
                break;
            }

            if (sign.equals("_")) {
                FractionalUtils.fractionalToLine(fractNum1);

            }

            if (sign.equals("+") || sign.equals("-") || sign.equals("*") || sign.equals("/")) {
                if (sign.equals("+")) {
                    res = FractionalUtils.addition2Fractionals(fractNum1, fractNum2);
                }

                if (sign.equals("-")) {
                    res = FractionalUtils.subtraction2Fractionals(fractNum1, fractNum2);
                }

                if (sign.equals("*")) {
                    res = FractionalUtils.multiplication2Fractionals(fractNum1, fractNum2);
                }

                if (sign.equals("/")) {
                    res = FractionalUtils.division2Fractionals(fractNum1, fractNum2);
                }

                FractionalUtils.printFractionalOperationWithResult(fractNum1, fractNum2, sign, res);
            }

            if (sign.equals("=")) {
                FractionalUtils.printFractional(fractNum1);
                System.out.print(" > ");
                FractionalUtils.printFractional(fractNum2);
                System.out.println(" ?\n" + FractionalUtils.comparison2Fractionals(fractNum1, fractNum2));
            }
        }
    }
}
