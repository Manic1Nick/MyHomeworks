package OOPhomeworksWeek1.model;

import OOPhomeworksWeek1.ArithmeticUtils;

public class FractionalNumber {

    //find numerator
    public static int findNumerator(String num) {

        int numerator = 0;

        for (int i = 0; i < num.length(); i++) {
            if (num.substring(i, i+1).equals("/")) {
                numerator = Integer.parseInt(num.substring(0, i));
                break;
            }
        }
        return numerator;
    }


    //find denominator
    public static int findDenominator(String num) {

        int denominator = 0;

        for (int i = 0; i < num.length(); i++) {
            if (num.substring(i, i+1).equals("/")) {
                denominator = Integer.parseInt(num.substring(i+1, num.length()));
                break;
            }
        }
        return denominator;
    }

    //reduction fractional *light version*
    public static String reductionFractionals(String num) {

        int numerator = findNumerator(num);
        int denominator = findDenominator(num);

        if (denominator % numerator == 0) {
            denominator /= numerator;
            numerator = 1;
        } else {
            for (int i = 10; i > 0; i--) {
                if (denominator % i == 0 && numerator % i == 0) {
                    numerator /= i;
                    denominator /= i;
                }
            }
        }
        return numerator + "/" + denominator;
    }


    public static String addition2Fractionals(String num1, String num2) {

        int numerator = findNumerator(num1) * findDenominator(num2) + findNumerator(num2) * findDenominator(num1);
        int denominator = findDenominator(num1) * findDenominator(num2);

        return (reductionFractionals(numerator + "/" + denominator));
    }


    public static String subtraction2Fractionals(String num1, String num2) {

        int numerator = findNumerator(num1) * findDenominator(num2) - findNumerator(num2) * findDenominator(num1);
        int denominator = findDenominator(num1) * findDenominator(num2);

        return (reductionFractionals(numerator + "/" + denominator));
    }


    public static String multiplication2Fractionals(String num1, String num2) {

        int numerator = findNumerator(num1) * findNumerator(num2);
        int denominator = findDenominator(num1) * findDenominator(num2);

        return (reductionFractionals(numerator + "/" + denominator));
    }

    public static String division2Fractionals(String num1, String num2) {

        int numerator = findNumerator(num1) * findDenominator(num2);
        int denominator = findDenominator(num1) * findNumerator(num2);

        return (reductionFractionals(numerator + "/" + denominator));
    }



    public static double fractionalToLine(String num) {

        double numerator = findNumerator(num);
        double denominator = findDenominator(num);
        return ArithmeticUtils.roundDouble(numerator / denominator, 5);
    }

    public static void printFractional(String num) {

        System.out.println(num);
    }


    public static boolean comparison2Fractionals(String num1, String num2) {

        double num1numer = findNumerator(num1);
        double num1denom = findDenominator(num1);
        double num2numer = findNumerator(num2);
        double num2denom = findDenominator(num2);

        return (num1numer / num1denom) > (num2numer / num2denom) ? true : false ;
    }


}
