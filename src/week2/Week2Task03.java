package week2;

import java.util.Scanner;

 /*3) Заданы два массива одинаковой длины с любыми значениями
    скопировать данные из первого массива во второй*/

public class Week2Task03 {

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

        ArrayUtils.copyMas1ToMas2(mas1, mas2);

        if (size1 == size2) {
            String res3 = ArrayUtils.convertMas(mas1);
            System.out.println(" Array1 after: " + res3);
            String res4 = ArrayUtils.convertMas(mas2);
            System.out.println(" Array2 after: " + res4);
        }
    }
}
