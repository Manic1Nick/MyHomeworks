package OOPHomeWeek1;

import OOPHomeWeek1.models.Number;
import OOPHomeWeek1.utils.UtilsArithmetic;

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

            System.out.print("\nT e s t i n g    l i s t   " + (i + 1) +
                    "\nfor numbers: " + (int)(number.getValue()) + ", " + (int)(num2.getValue()) + "\n");

            if (test(number, num2) == true) {
                System.out.print("\nCongratulation! Test was successful");
            } else {
                System.out.print("\nLook above for search mistakes");
            }
        }
    }

    public static boolean test(Number number, Number num2) {

        String[] operations = {"add", "sub", "mult", "div", "pow", "fact", "rem", "comp"};
        int[] resTrue = new int[operations.length];
        int[] resFact = new int[operations.length];

        resTrue[0] = (int) UtilsArithmetic.additionNum1Num2(number.getValue(), num2.getValue());
        resTrue[1] = (int) UtilsArithmetic.subtractionNum1Num2(number.getValue(), num2.getValue());
        resTrue[2] = (int) UtilsArithmetic.multiplicationNum1Num2(number.getValue(), num2.getValue());
        resTrue[3] = (int) UtilsArithmetic.divisionNum1Num2(number.getValue(), num2.getValue());
        resTrue[4] = (int) UtilsArithmetic.involutionNum1Num2(number.getValue(), num2.getValue());
        resTrue[5] = (int) UtilsArithmetic.factorialOfNumber((int)number.getValue());
        resTrue[6] = (int) UtilsArithmetic.remainderNum1Num2(number.getValue(), num2.getValue());
        resTrue[7] = UtilsArithmetic.comparisonNum1Num2(number.getValue(), num2.getValue()) == true ? 1 : 0 ;

        resFact[0] = (int)(number.add(num2)).getValue();
        resFact[1] = (int)(number.sub(num2)).getValue();
        resFact[2] = (int)(number.mult(num2)).getValue();
        resFact[3] = (int)(number.div(num2)).getValue();
        resFact[4] = (int)(number.pow(num2)).getValue();
        resFact[5] = (int)(number.fact()).getValue();
        resFact[6] = (int)(number.rem(num2)).getValue();
        resFact[7] = number.comp(num2) == true ? 1 : 0;

        int countTrue = 0;

        for (int i = 0; i < operations.length; i++) {
            System.out.printf("method %s, exp = %d, fact = %d, %s",
                    operations[i], resTrue[i], resFact[i], resFact[i] == resTrue[i]);

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