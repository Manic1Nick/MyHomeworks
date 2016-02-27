import java.util.Scanner;

public class week1Task07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        double number1 = sc.nextDouble();
        System.out.println("Input 2st number: ");
        double number2 = sc.nextDouble();

        if (number1 >= number2) {
            boolean result1 = number1 % number2 == 0;
            System.out.println(result1 + "\n" + "Result is: " + number1 / number2);
        } else {
            boolean result2 = number2 % number1 == 0;
            System.out.println(result2 + "\n" + "Result is: " + number2 / number1);
        }
    }
}
