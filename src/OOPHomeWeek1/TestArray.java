package OOPHomeWeek1;

import OOPHomeWeek1.models.Array;
import OOPHomeWeek1.utils.UtilsArray;

import java.util.Scanner;

public class TestArray {

    public static void main(String[] args) {

        for (int i = 0; ; i++) {

            Scanner sc = new Scanner(System.in);
            System.out.println("\n\nInput size of new array:");
            int size = sc.nextInt();
            System.out.println("Input range for numbers new array:");
            int range = sc.nextInt();

            int[] newArr = new int[size];
            Array arr = new Array(newArr);
            arr.genArray(range);

            System.out.print("\nT e s t i n g    l i s t   " + (i + 1) + "\nfor array: ");
            arr.printArray();
            System.out.print("\n");

            if (test(arr) == true) {
                System.out.print("\n\nCongratulation! Test was successful");
            } else {
                System.out.print("\n\nLook above for search mistakes");
            }
        }
    }

    public static boolean test(Array arr) {

        String[] operations = {"findmin", "findmax"};
        int[] resTrue = new int[operations.length];
        int[] resFact = new int[operations.length];

        resTrue[0] = UtilsArray.findMinIndex(arr.getArray());
        resTrue[1] = UtilsArray.findMaxIndex(arr.getArray());

        resFact[0] = arr.findMinInArray();
        resFact[1] = arr.findMaxInArray();

        int countTrue = 0;

        for (int i = 0; i < operations.length; i++) {
            System.out.printf("method %s, exp = %d, fact = %d, %s",
                    operations[i], resTrue[i], resFact[i], resFact[i] == resTrue[i]);

            if (resFact[i] == resTrue[i]) {
                countTrue++;
                System.out.print(" ... OK\n");
            } else {
                System.out.print(" ... mistake!\n");
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nInput add size for numbers to increase array:");
        int addSize = sc.nextInt();

        System.out.print("\nmethod increase, array after is: ");
        arr.increaseArray(addSize).printArray();
        System.out.print("\nmethod sorting++, array after is: ");
        arr.sortingArray("++").printArray();
        System.out.print("\nmethod sorting--, array after is: ");
        arr.sortingArray("--").printArray();

        return countTrue == operations.length ? true : false ;
    }
}