package homeworksWeek2;

import artcodeUtils.ArrayUtils;

import java.util.Scanner;

/*9) Задать два массива случайными числами от 25 до 75.
    Определить у какого из массивов больше парных елементов.*/

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
