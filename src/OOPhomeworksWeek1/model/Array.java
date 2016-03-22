package OOPhomeworksWeek1.model;

public class Array {

    //generate array with random numbers
    public static int[] generateRandomArray(int size, int range) {

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * range);
        }
        return array;
    }

    //find MIN in array
    public static int findMinNumberInArray(int[] array) {

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

    //find MAX in array
    public static int findMaxNumberInArray(int[] array) {

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }

    //convert array
    public static String convertArray(int[] array) {

        String res = "";

        for (int i = 0; i < array.length - 1; i++) {
            res = array[i] + " ";
        }
        return res + array[array.length - 1];
    }

    //convert and print array
    public static void printArray(int[] array) {

        System.out.print("{");

        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print(array[array.length - 1] + "}");
    }

    //increase size of array
    public static int[] increaseArray(int[] array, int addSize) {

        int[] newArray = new int[array.length + addSize];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    //sorting array increase (+) or decrease (-)
    public static int[] sortingArray(int[] array, String sign) {

        int current = 0;

        if (sign.equals("++")) {

            for (int k = 0; k < 1; ) {

                int count = 0;

                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] > array[i + 1]) {
                        current = array[i + 1];
                        array[i + 1] = array[i];
                        array[i] = current;
                    }
                }

                for (int i = 0; i < array.length - 1; i++) {
                    if ((array[i + 1] - array[i]) < 0) {
                        break;
                    } else {
                        count++;
                    }
                }
                k = count == (array.length - 1) ? 1 : 0 ;
            }
        }

        if (sign.equals("--")) {

            for (int k = 0; k < 1; ) {

                int count = 0;

                for (int i = 0; i < array.length - 1; i++) {
                    if (array[i] < array[i + 1]) {
                        current = array[i + 1];
                        array[i + 1] = array[i];
                        array[i] = current;
                    }
                }

                for (int i = 0; i < array.length - 1; i++) {
                    if ((array[i + 1] - array[i]) > 0) {
                        break;
                    } else {
                        count++;
                    }
                }
                k = count == (array.length - 1) ? 1 : 0 ;
            }
        }
        return array;
    }

}
