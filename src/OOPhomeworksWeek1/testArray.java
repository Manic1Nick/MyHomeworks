package OOPhomeworksWeek1;

import OOPhomeworksWeek1.model.Array;

import java.util.Scanner;

public class testArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array:");
        int size = sc.nextInt();
        System.out.println("Input range of numbers array:");
        int range = sc.nextInt();

        int[] array = Array.generateRandomArray(size, range);
        System.out.println("\nArray is:\n");
        Array.printArray(array);

        System.out.println("\n\nMin is: " + Array.findMinNumberInArray(array) +
                           "\nMax is: " + Array.findMaxNumberInArray(array));

        System.out.println("\nInput additional size of array:");
        int[] newArray = Array.increaseArray(array, sc.nextInt());
        Array.printArray(newArray);

        System.out.println("\n\nFor sorting numbers in array input " +
                            "\n++ for increase" +
                            "\n-- for decrease\n");
        String sign = sc.next();
        int[] sortArray = Array.sortingArray(array, sign);
        Array.printArray(sortArray);

    }

}
