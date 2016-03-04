package week2;

import java.util.Scanner;

public class Week2Task09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array1: ");
        int size1 = sc.nextInt();
        System.out.println("Input size of array2: ");
        int size2 = sc.nextInt();

        ArrayUtils.evenElementsInMas(size1, size2);
    }
}
