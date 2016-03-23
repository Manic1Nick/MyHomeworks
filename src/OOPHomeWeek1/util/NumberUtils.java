package OOPHomeWeek1.util;

public class NumberUtils {

    public static int generateNum(int from, int to) {
        return (from + (int)(Math.random() * (to - from)));
    }

    //operations with number

    public static double additionNum1Num2(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtractionNum1Num2(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicationNum1Num2(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisionNum1Num2(double num1, double num2) {
        return num1 / num2;
    }

    public static int involutionNum1Num2(double num1, double num2) {
        return (int) Math.pow(num1, num2);
    }

    public static int factorialNum1(int num) {
        if (num <= 1) {
            return 1;
        } else {
            return ArithmeticUtils.factorialOfNumber(num);
        }
    }

    public static double remainderNum1Num2(double num1, double num2) {
        return num1 % num2;
    }

    public static boolean comparisonNum1Num2(double num1, double num2) {
        return num1 == num2 ? true : false ;
    }


    //round double to scale-signs
    public static double roundDouble(double num, int scale) {
        return Math.round(num * Math.pow(10, scale)) / Math.pow(10, scale);
    }

    //factorial of number (my version from artcode base)
    public static int factorialOfNumber(int number) {

        double numCur;
        double numLast;
        int numRes = 0;
        int numLastFact;

        for (int i = 0; i <= number;) {
            numCur = number / (Math.pow(10, i));

            if ((int)numCur != 0) {
                numLast = numCur % 10;
                numLastFact = 1;

                for (int f = 1; f <= (int)numLast;) {
                    numLastFact *= f;
                    f++;
                }
                numRes += numLastFact;
            }
            i++;
        }
        return numRes;
    }
}