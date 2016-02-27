package week1;

import java.util.Scanner;

public class week1Task04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        double number = sc.nextDouble();
        boolean resFromTo = number > 0 && number < 1;

        System.out.println("Is this number from 0 to 1 ?\n" + resFromTo);
    }
}
