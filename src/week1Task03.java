import java.util.Scanner;

public class week1Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int number = sc.nextInt();

        if (number % 7 == 0) {
            System.out.println(number * 2);
        }
    }
}
