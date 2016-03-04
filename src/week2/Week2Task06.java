package week2;

import java.util.Scanner;

/*6) Найти среднее арифметическое массива*/

public class Week2Task06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = sc.nextInt();
        System.out.println("Input range of array: ");
        int range = sc.nextInt();

        int[] mas = ArrayUtils.generateMas(size, range);
        int average = ArrayUtils.findAverageOfMas(mas);

        String res = ArrayUtils.convertMas(mas);
        System.out.println("Array is: " + res);
        System.out.println("Average of array is: " + average);
    }
}
