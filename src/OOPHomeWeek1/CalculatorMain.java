package OOPHomeWeek1;

import OOPHomeWeek1.models.Calculator;
import OOPHomeWeek1.models.Number;
import OOPHomeWeek1.utils.UtilsArithmetic;

import java.util.Scanner;

public class CalculatorMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number1 for operation:");
        double num1 = sc.nextDouble();
        System.out.println("Input number2 for operation:");
        double num2 = sc.nextDouble();

        for (int i = 0; ; ) {
            System.out.println("\nInput sign of operation:" +
                    "\n\"+\" for addition" +
                    "\n\"-\" for subtraction" +
                    "\n\"*\" for multiplication" +
                    "\n\"/\" for division" +
                    "\nor put 0 for exit\n");
            String sign = sc.next();

            if (sign.equals("0")) {
                break;
            }

            Number res = new Number(num1);

            if (sign.equals("+")) {
                res = new Calculator().add(new Number(num1), new Number(num2));
            }

            if (sign.equals("-")) {
                res = new Calculator().sub(new Number(num1), new Number(num2));
            }

            if (sign.equals("*")) {
                res = new Calculator().mult(new Number(num1), new Number(num2));
            }

            if (sign.equals("/")) {
                res = new Calculator().div(new Number(num1), new Number(num2));
            }

            System.out.println(num1 + " " + sign + " " + num2 + " = " + UtilsArithmetic.roundDouble(res.getValue(), 1));
        }
    }
}
