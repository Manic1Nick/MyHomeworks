package week2;

import java.util.Scanner;

public class Week2Task10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = sc.nextInt();
        System.out.println("Input range of array: ");
        int range = sc.nextInt();

        int[] mas = ArrayUtils.generateMas(size, range);

        System.out.println("Input start index of split: ");
        int start = sc.nextInt();
        System.out.println("Input end index of split: ");
        int end = sc.nextInt();

        int[] resMas = ArrayUtils.splitArray(mas, start, end);

        String res1 = ArrayUtils.convertMas(mas);
        System.out.println("Array before: " + res1);
        String res2 = ArrayUtils.convertMas(resMas);
        System.out.println(" Array after: " + res2);
    }
}
