package week2;

import java.util.Scanner;

/*2.4 Сдвинуть массив на заданное количество позиций // {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
		Количество позиций и массив указывает пользователь*/

public class Week2Task24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int size = sc.nextInt();
        System.out.println("Input range of array: ");
        int range = sc.nextInt();

        int[] mas1 = ArrayUtils.generateMas(size, range);

        String res1 = ArrayUtils.convertMas(mas1);
        System.out.println("Array before: " + res1);
        System.out.println("Input index of move: ");
        int move = sc.nextInt();

        int[] mas2 = AddArrayUtils.moveArray(mas1, move);

        String res2 = ArrayUtils.convertMas(mas2);
        System.out.println(" Array after: " + res2);
    }
}
