package week2;

import java.util.Scanner;

/*2.1 Инвертировать массив (без использования допольнительного массива)*/

public class Week2Task21 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = sc.nextInt();
        System.out.println("Input range of array: ");
        int range = sc.nextInt();

        int[] mas1 = ArrayUtils.generateMas(size, range);

        String res1 = ArrayUtils.convertMas(mas1);
        System.out.println("Array before: " + res1);

        int[] mas2 = AddArrayUtils.invertArray(mas1);

        String res2 = ArrayUtils.convertMas(mas2);
        System.out.println(" Array after: " + res2);
    }
}
