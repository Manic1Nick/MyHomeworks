package week2;

public class ArrayUtils {

    /*Создание массива*/
    public static int[] generateMas(int size, int range) {
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * range);
        }
        return mas;
    }

    /*Конвертация массива*/
    public static String convertMas(int[] mas) {
        String res = "";
        for (int i = 0; i < mas.length; i++) {
            res = res + mas[i] + ", ";
        }
        return res;
    }

    /*Вывод массива на консоль*/
    public static void printMas(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ", ");
        }
    }


    /*1) найти минимальное и максимальное значения в массиве и вывести их на консоль*/

    public static void findMinAndMax(int[] mas) {

        int minIndex = ArrayUtils.findMinIndex(mas);
        int maxIndex = ArrayUtils.findMaxIndex(mas);

        String str = ArrayUtils.convertMas(mas);
        System.out.println("Array is: " + str);
        System.out.println("Max number is: " + maxIndex + "\nMin number is: " + minIndex);
    }

    public static int findMinIndex(int[] mas) {

        int minIndex = mas[0];

        for (int i = 0; i < mas.length; i++) {
            minIndex = Math.min(minIndex, mas[i]);
        }
        return minIndex;
    }

    public static int findMaxIndex(int[] mas) {

        int maxIndex = mas[0];

        for (int i = 0; i < mas.length; i++) {
            maxIndex = Math.max(maxIndex, mas[i]);
        }
        return maxIndex;
    }



    /*2) Поменять местами наибольший и наименьший элементы в массиве*/

    public static int[] replaceMinMax(int[] mas) {

        int maxIndex = ArrayUtils.findMaxIndex(mas);
        int minIndex = ArrayUtils.findMinIndex(mas);
        int iMax = 0;
        int iMin = 0;

        for (int i = 0; i < mas.length; i++) {
            if (maxIndex == mas[i]) {
                iMax = i;
            }
            if (minIndex == mas[i]) {
                iMin = i;
            }
        }
        mas[iMax] = minIndex;
        mas[iMin] = maxIndex;

        return mas;
    }


    /*3) Заданы два массива одинаковой длины с любыми значениями
    скопировать данные из первого массива во второй*/

    public static int[] copyMas1ToMas2(int[] mas1, int[] mas2) {

        if (mas1.length == mas2.length) {

            for (int i = 0; i < mas1.length; i++) {
                mas2[i] = mas1[i];
            }

        } else {
            System.out.println("You have entered different size arrays! Try again");
            return null;
        }
        return mas2;
    }


    /*4) Посчитать сколько цифр(цифра задается пользователем) в массиве*/

    public static int countNumInMas(int number, int[] mas) {

        int count = 0;

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == number) {
                count++;
            }
        }

        return count;
    }


    /*5) Заполнить массив случайными значениями. На четных индексах парные значения, на нечетных непарные*/

    public static int[] generateMasEvenRandomOnEvenIndex(int size, int range) {

        int[] mas = new int[size];
        int random = 0;

        for (int i = 0; i < mas.length; i++) {
            random = (int) (Math.random() * range);
            if (i == 0 || i %2 == 0) {
                mas[i] = random %2 == 0 ? random : random + 1;
            } else {
                mas[i] = random %2 != 0 ? random : random + 1;
            }
        }
        return mas;
    }


    /*6) Найти среднее арифметическое массива*/

    public static int findAverageOfMas(int[] mas) {

        int sum = 0;

        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }

        return (sum / mas.length);
    }



    /*7) Вывести в консоль элементы той половины одномерного массива
    у которой среднее арифметическое максимальное*/

    public static void averageOfHalfMas(int[] mas) {
        int sum1 = 0;
        int sum2 = 0;
        int halfMas = mas.length / 2;

        for (int i = 0; i < halfMas; i++) {
            sum1 += mas[i];
        }

        for (int i = halfMas; i < mas.length; i++) {
            sum2 += mas[i];
        }

        if (sum1 / halfMas > sum2 / halfMas) {
            ArrayUtils.printPartOfMas(mas, 0, halfMas);
        } else {
            ArrayUtils.printPartOfMas(mas, halfMas, mas.length);
        }
    }

    public static void printPartOfMas(int[] mas, int start, int end) {

        for (int i = start; i < end; i++) {
            System.out.print(mas[i] + ", ");
        }
    }



    /*8) Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
	   который получается в результате суммы arr1[i] + arr2[i]*/

    public static void summArr1Arr2(int[] arr1, int[] arr2) {

        if (arr1.length == arr2.length) {

            int[] arr3 = new int[arr1.length];

            for (int i = 0; i < arr1.length; i++) {
                arr3[i] = arr1[i] + arr2[i];
                System.out.print(arr3[i] + ", ");
            }
        } else {
            System.out.print("Array length must be the same!");
        }
    }



    /*9) Задать два массива случайными числами от 25 до 75.
    Определить у какого из массивов больше парных елементов.*/

    public static boolean evenElementsInMas(int size1, int size2) {

        int[] mas1 = new int[size1];
        int[] mas2 = new int[size2];
        int even1 = 0;
        int even2 = 0;

        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) (Math.random() * 50) + 25;
            if (mas1[i] % 2 == 0) {
                even1++;
            }
        }
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = (int) (Math.random() * 50) + 25;
            if (mas2[i] % 2 == 0) {
                even2++;
            }
        }

        System.out.print("\nArray1 is: ");
        ArrayUtils.printMas(mas1);
        System.out.print("\nArray2 is: ");
        ArrayUtils.printMas(mas2);

        boolean res = even1 > even2;
        System.out.println("\n\nArray1 has more even numbers than array2?\n" + res);

        return res;
    }



    /*10) public static int[] splitArray(int[] arr, int start, int end)
    { // обрезать массив по границам start и end}*/

    public static int[] splitArray(int[] arr, int start, int end) {

        if (start >= 0 && start <= arr.length && end >= 0 && end <= arr.length) {

            int[] split = new int[end - start + 1];

            for(int i = 0; i < split.length; i++) {
                split[i] = arr[start + i];
            }
            return split;
        }
        return null;
    }
}