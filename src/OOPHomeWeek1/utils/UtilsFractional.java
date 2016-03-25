package OOPHomeWeek1.utils;

import OOPHomeWeek1test3.model.Fractional;

public class UtilsFractional {

    //find numerator from String
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


    //find denominator from String
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

    //fractional number with reduction
    public static Fractional fractionalFractNum(int numerator, int denominator) {

        if (denominator % numerator == 0) {
            denominator /= numerator;
            numerator = 1;
        } else {
            for (int i = 10; i < 0; i--) {
                if (denominator / numerator == i) {
                    numerator /= i;
                    denominator /= i;
                }
            }
        }
        return new Fractional(numerator, denominator);
    }



    //reduction fractional ---> 2 elements to array
    public static int[] reductionFractional(int numerator, int denominator) {

        if (denominator % numerator == 0) {
            denominator /= numerator;
            numerator = 1;
        } else {
            for (int i = 10; i > 0; i--) {
                if (denominator / numerator == i) {
                    numerator /= i;
                    denominator /= i;
                }
            }
        }
        int[] array = {numerator, denominator};
        return array;
    }


    public static Fractional addition2Fractionals(Fractional num1, Fractional num2) {

        int numerator = num1.getNumerator() * num2.getDenominator() +
                num2.getNumerator() * num1.getDenominator();
        int denominator = num1.getDenominator() * num2.getDenominator();

        int[] array = reductionFractional(numerator, denominator);

        return new Fractional(array[0], array[1]);
    }


    public static Fractional subtraction2Fractionals(Fractional num1, Fractional num2) {

        int numerator = num1.getNumerator() * num2.getDenominator() -
                num2.getNumerator() * num1.getDenominator();
        int denominator = num1.getDenominator() * num2.getDenominator();

        int[] array = reductionFractional(numerator, denominator);

        return new Fractional(array[0], array[1]);
    }


    public static Fractional multiplication2Fractionals(Fractional num1, Fractional num2) {

        int numerator = num1.getNumerator() * num2.getNumerator();
        int denominator = num1.getDenominator() * num2.getDenominator();

        int[] array = reductionFractional(numerator, denominator);

        return new Fractional(array[0], array[1]);
    }


    public static Fractional division2Fractionals(Fractional num1, Fractional num2) {

        int numerator = num1.getNumerator() * num2.getDenominator();
        int denominator = num1.getDenominator() * num2.getNumerator();

        int[] array = reductionFractional(numerator, denominator);

        return new Fractional(array[0], array[1]);
    }


    public static boolean comparison2Fractionals(Fractional num1, Fractional num2) {

        return (num1.getDenominator() / num1.getNumerator() <
                num2.getDenominator() / num2.getNumerator()) ? true : false ;
    }


    public static void fractionalToLine(Fractional num) {

        double numerator = num.getNumerator();
        double denominator = num.getDenominator();
        System.out.print(Double.toString(numerator/denominator));
    }


    public static void printFractional(Fractional num) {

        System.out.print(num.getNumerator() + "/" + num.getDenominator());
    }


    public static void printFractionalOperationWithResult(Fractional num1, Fractional num2,
                                                           String sign, Fractional res) {

        printFractional(num1);
        System.out.print(" " + sign + " ");
        printFractional(num2);
        System.out.print(" = ");
        printFractional(res);
    }



}