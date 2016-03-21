package homeworksWeek2;

import artcodeUtils.ArrayUtils;

import java.util.Scanner;

/*2) Поменять местами наибольший и наименьший элементы в массиве*/

public class Week2Task02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = sc.nextInt();
        System.out.println("Input range of array: ");
        int range = sc.nextInt();

        int[] mas = ArrayUtils.generateMasRandom(size, range);

        String res1 = ArrayUtils.convertMas(mas);
        System.out.println("Array before: " + res1);

        ArrayUtils.replaceMinMax(mas);

        String res2 = ArrayUtils.convertMas(mas);
        System.out.println("Array before: " + res2);
    }
}
