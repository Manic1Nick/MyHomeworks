package week2;

import java.util.Scanner;

public class Week2Task08 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array1: ");
        int size1 = sc.nextInt();
        System.out.println("Input size of array2: ");
        int size2 = sc.nextInt();
        System.out.println("Input range of array1: ");
        int range1 = sc.nextInt();
        System.out.println("Input range of array2: ");
        int range2 = sc.nextInt();

        int[] mas1 = ArrayUtils.generateMas(size1, range1);
        int[] mas2 = ArrayUtils.generateMas(size2, range2);

        String res1 = ArrayUtils.convertMas(mas1);
        System.out.println("Array1 before: " + res1);
        String res2 = ArrayUtils.convertMas(mas2);
        System.out.println("Array2 before: " + res2);

        System.out.println("Array1 + Array2 is: ");

        ArrayUtils.summArr1Arr2(mas1, mas2);
    }
}
