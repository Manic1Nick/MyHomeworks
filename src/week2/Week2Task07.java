package week2;

import java.util.Scanner;

public class Week2Task07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = sc.nextInt();
        System.out.println("Input range of array: ");
        int range = sc.nextInt();

        int[] mas = ArrayUtils.generateMas(size, range);

        String res = ArrayUtils.convertMas(mas);
        System.out.println("Array is: " + res);
        System.out.println("Bigger average is on this half of array: ");

        ArrayUtils.averageOfHalfMas(mas);
    }
}
