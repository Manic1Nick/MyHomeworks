package week2;

import java.util.Scanner;

public class Week2Task04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = sc.nextInt();
        System.out.println("Input range of array: ");
        int range = sc.nextInt();

        int[] mas = ArrayUtils.generateMas(size, range);

        String res1 = ArrayUtils.convertMas(mas);
        System.out.println("Array is: " + res1);

        System.out.println("Input number from array: ");
        int number = sc.nextInt();

        int count = ArrayUtils.countNumInMas(number, mas);

        System.out.println("Number " + number + " occurs " + count + " times in the array");

    }
}
