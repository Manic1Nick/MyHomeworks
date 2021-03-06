package homeworksWeek2;

import artcodeUtils.ArrayUtils;

import java.util.Scanner;

/*8) Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
	   который получается в результате суммы arr1[i] + arr2[i]*/

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

        int[] mas1 = ArrayUtils.generateMasRandom(size1, range1);
        int[] mas2 = ArrayUtils.generateMasRandom(size2, range2);

        String res1 = ArrayUtils.convertMas(mas1);
        System.out.println("Array1 before: " + res1);
        String res2 = ArrayUtils.convertMas(mas2);
        System.out.println("Array2 before: " + res2);

        System.out.println("Array1 + Array2 is: ");

        ArrayUtils.summArr1Arr2(mas1, mas2);
    }
}
