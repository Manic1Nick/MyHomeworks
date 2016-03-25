package OOPHomeWeek1;

import OOPHomeWeek1.models.Fractional;
import OOPHomeWeek1.utils.UtilsArithmetic;
import OOPHomeWeek1.utils.UtilsFractional;

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

            System.out.print("\nT e s t i n g    l i s t   " + (i + 1) +
                    "\nfor fractional numbers: " + test1 + ", " + test2);

            if (test(number, num2) == true) {
                System.out.print("\nCongratulation! Test was successful");
            } else {
                System.out.print("\nLook above for search mistakes");
            }
        }
    }

    public static boolean test(Fractional num1, Fractional num2) {

        String[] operations = {"add", "sub", "mult", "div", "comp"};
        int[] resTrue = new int[operations.length];
        int[] resFact = new int[operations.length];
        Fractional[] resForPrint = new Fractional[operations.length];

        double resTrue1 = num1.getNumerator() / num1.getDenominator();
        double resTrue2 = num2.getNumerator() / num2.getDenominator();
        int round = 100000;

        resTrue[0] = (int)(UtilsArithmetic.additionNum1Num2(resTrue1, resTrue2) * round);
        resTrue[1] = (int)(UtilsArithmetic.subtractionNum1Num2(resTrue1, resTrue2) * round);
        resTrue[2] = (int)(UtilsArithmetic.multiplicationNum1Num2(resTrue1, resTrue2) * round);
        resTrue[3] = (int)(UtilsArithmetic.divisionNum1Num2(resTrue1, resTrue2) * round);
        resTrue[4] = UtilsArithmetic.comparisonNum1Num2(resTrue1 * round, resTrue2 * round) == true ? 1 : 0 ;

        resFact[0] = (int)((num1.add(num2)).getNumerator() / ((num1.add(num2)).getDenominator()) * round);
        resFact[1] = (int)((num1.sub(num2)).getNumerator() / ((num1.sub(num2)).getDenominator()) * round);
        resFact[2] = (int)((num1.mult(num2)).getNumerator() / ((num1.mult(num2)).getDenominator()) * round);
        resFact[3] = (int)((num1.div(num2)).getNumerator() / ((num1.div(num2)).getDenominator()) * round);
        resFact[4] = num1.comp(num2) == true ? 1 : 0;

        resForPrint[0] = num1.add(num2);
        resForPrint[1] = num1.sub(num2);
        resForPrint[2] = num1.mult(num2);
        resForPrint[3] = num1.div(num2);
        resForPrint[4] = num1;

        int countTrue = 0;

        for (int i = 0; i < operations.length; i++) {
            System.out.printf("method %s, exp = %d, fact = %d, %s, result = ",
                    operations[i], resTrue[i], resFact[i], resFact[i] == resTrue[i]);
            resForPrint[i].printFractional();

            if (resFact[i] == resTrue[i]) {
                countTrue++;
                System.out.print(" ... OK\n");
            } else {
                System.out.print(" ... mistake!\n");
            }
        }
        return countTrue == operations.length ? true : false ;
    }
}