package OOPHomeWeek1.utils;

public class UtilsArithmetic {


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

    public static int factorialOfNumber(int num) {
        if (num <= 1) {
            return 1;

        } else {
            double numCur;
            double numLast;
            int numRes = 0;
            int numLastFact;

            for (int i = 0; i <= num;) {
                numCur = num / (Math.pow(10, i));

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

    public static double remainderNum1Num2(double num1, double num2) {
        return num1 % num2;
    }

    public static boolean comparisonNum1Num2(double num1, double num2) {
        return num1 == num2 ? true : false ;
    }


    //find num1, operation, and num2 from String line
    public static String[] findNumsAndOperation(String line) {

        String[] lineArr = new String[3];

        for (int i = 0; i < line.length(); i++) {

            if (line.substring(i, i+1).equals("+") ||
                    line.substring(i, i+1).equals("-") ||
                    line.substring(i, i+1).equals("*") ||
                    line.substring(i, i+1).equals("/")) {
                lineArr[0] = line.substring(0, i);
                lineArr[1] = line.substring(i, i+1);
                lineArr[2] = line.substring(i+1, line.length());
                break;
            }
        }
        return lineArr;
    }

    //simple calculator for 2 numbers and 4 operations
    public static double operations2Nums(String line) {

        String[] lineArr = findNumsAndOperation(line);
        double num1 = Double.parseDouble(lineArr[0]);
        double num2 = Double.parseDouble(lineArr[2]);
        double res = 0;

        if (lineArr[1].equals("+")) {
            res = num1 + num2;
        }
        if (lineArr[1].equals("-")) {
            res = num1 - num2;
        }
        if (lineArr[1].equals("*")) {
            res = num1 * num2;
        }
        if (lineArr[1].equals("/")) {
            res = num1 / num2;
        }
        return res;
    }

    //round double to scale-signs
    public static double roundDouble(double num, int scale) {
        return Math.round(num * Math.pow(10, scale)) / Math.pow(10, scale);
    }
}
