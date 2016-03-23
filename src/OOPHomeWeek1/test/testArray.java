package OOPHomeWeek1.test;

import OOPHomeWeek1.util.ArrayUtils;

import java.util.Scanner;

public class testArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of array:");
        int size = sc.nextInt();
        System.out.println("Input MIN range of numbers:");
        int from = sc.nextInt();
        System.out.println("Input MAX range of numbers:");
        int to = sc.nextInt();

        //generate array
        int[] array = ArrayUtils.generateRandomArray(size, from, to);
        System.out.println("\nArray is:\n");
        ArrayUtils.printArray(array);

        //find min max
        System.out.println("\n\nMin number in array is: " + ArrayUtils.findMinNumberInArray(array) +
                "\nMax number in array is: " + ArrayUtils.findMaxNumberInArray(array));

        //additional size
        System.out.println("\nInput additional size of array:");
        int addSize = sc.nextInt();
        int[] bigArray = ArrayUtils.increaseArray(array, addSize);
        ArrayUtils.printArray(bigArray);

        System.out.println("\nAdd random numbers for new elements in the array?" +
                "\nEnter Y (yes) or N (no): ");
        if (sc.next().toUpperCase().equals("Y")) {
            bigArray = ArrayUtils.generateRandomPartArray(array, bigArray, from, to);
            ArrayUtils.printArray(bigArray);
        }

        //sorting
        System.out.println("\n\nFor sorting numbers in array input " +
                "\n++ for increase numbers" +
                "\n-- for decrease numbers\n");
        String sign = sc.next();
        int[] sortArray = ArrayUtils.sortingArray(array, sign);
        ArrayUtils.printArray(sortArray);

        //compare
        System.out.println("\nGenerate new array for compare");
        System.out.println("Input size of new array:");
        int size2 = sc.nextInt();

        int[] array2 = ArrayUtils.generateRandomArray(size2, from, to);

        System.out.println("Your array is:");
        ArrayUtils.printArray(array);
        System.out.println("New array is:");
        ArrayUtils.printArray(array2);
        boolean res = ArrayUtils.compare2Arrays(array, array2);
        System.out.println("\nIs those arrays equals?\n" + res);

    }
}