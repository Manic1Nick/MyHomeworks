package OOPhomeworksWeek1;

import java.util.Scanner;

public class CalculatorVers1 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; ; ) {
            System.out.println("\nInput numbers and operation + - * / without space, ex. 1+2, and push Enter" +
                               "\nor input 0 for exit");
            String line = sc.next();

            if (line.equals("0")) {
                break;
            }

            double res = ArithmeticUtils.operations2Nums(line);
            System.out.println(" = " + ArithmeticUtils.roundDouble(res, 1));
        }
    }

}
