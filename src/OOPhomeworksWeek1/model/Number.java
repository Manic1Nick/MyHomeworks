package OOPhomeworksWeek1.model;

import OOPhomeworksWeek1.ArithmeticUtils;

public class Number {

    public static int additionNum1Num2(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtractionNum1Num2(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplicationNum1Num2(int num1, int num2) {
        return num1 * num2;
    }

    public static int divisionNum1Num2(int num1, int num2) {
        return num1 / num2;
    }

    public static int involutionNum1Num2(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    public static int factorialNum1(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return ArithmeticUtils.factorialOfNumber(num);
        }
    }

    public static double remainderNum1Num2(int num1, int num2) {
        return num1 % num2;
    }

    public static boolean comparisonNum1Num2(int num1, int num2) {
        return num1 == num2 ? true : false ;
    }

}
