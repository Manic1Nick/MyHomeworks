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
    public static String convert(int[] mas) {
        String res = "";
        for (int i = 0; i < mas.length; i++) {
            res = res + mas[i] + ", ";
        }
        return res;
    }


    /*1) Найти минимальное и максимальное значения в массиве и вывести их на консоль*/

    public static void findMinMax(int[] mas) {

        int numMax = mas[0];
        int numMin = mas[0];

        for (int i = 0; i < mas.length; i++) {
            numMax = Math.max(numMax, mas[i]);
            numMin = Math.min(numMin, mas[i]);
        }

        System.out.println("Max number is: " + numMax + "\nMin number is: " + numMin);
    }

    /*2) Поменять местами наибольший и наименьший элементы в массиве*/

    public static int[] replaceMinMax(int[] mas) {

        int numMax = mas[0];
        int numMin = mas[0];
        int iMax = 0;
        int iMin = 0;

        for (int i = 0; i < mas.length; i++) {
            numMax = Math.max(numMax, mas[i]);
            numMin = Math.min(numMin, mas[i]);
        }
        for (int i = 0; i < mas.length; i++) {
            if (numMax == mas[i]) {
                iMax = i;
            }
            if (numMin == mas[i]) {
                iMin = i;
            }
        }
        mas[iMax] = numMin;
        mas[iMin] = numMax;

        return mas;
    }

    /*3) Заданы два массива одинаковой длины с любыми значениями
    скопировать данные из первого массива во второй*/

    public static int[] copyMas1ToMas2(int[] mas1, int[] mas2) {

        for (int i = 0; i < mas1.length; i++) {
            mas2[i] = mas1[i];
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
                if (random %2 == 0) {
                    mas[i] = random;
                } else {
                    mas[i] = random + 1;
                }

            } else {
                if (random %2 != 0) {
                    mas[i] = random;
                } else {
                    mas[i] = random + 1;
                }
            }
        }
        return mas;
    }

    /*6) Найти среднее арифметическое массива*/

    public static int resAverageOfMas(int[] mas) {

        int sum = 0;

        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
        }

        int resAverage = sum / mas.length;
        return resAverage;
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
            for (int i = 0; i < halfMas; i++) {
                System.out.print(mas[i] + ", ");
            }
        } else {
            for (int i = halfMas; i < mas.length; i++) {
                System.out.print(mas[i] + ", ");
            }
        }
    }

    /*8) Eсть два массива одинаковой длины arr1 и arr2 вывести в консоль значения массива,
	   который получается в результате суммы arr1[i] + arr2[i]*/

    public static void summArr1Arr2(int[] arr1, int[] arr2) {

        int[] arr3 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] + arr2[i];
            System.out.print(arr3[i] + " ");
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

        System.out.print("mas1 is: ");
        for (int i = 0; i < mas1.length; i++) {
            System.out.print(mas1[i] + ", ");
        }

        System.out.print("\nmas2 is: ");
        for (int i = 0; i < mas2.length; i++) {
            System.out.print(mas2[i] + ", ");
        }

        System.out.println("\nEven numbers in mas1 more than mas2?");

        if (even1 > even2) {
            return true;
        } else {
            return false;
        }
    }

    /*10) public static int[] splitArray(int[] arr, int start, int end)
    { // обрезать массив по границам start и end}*/

    public static int[] splitArray(int[] arr, int start, int end) {

        int[] split = new int[end - start];

        for(int i = 0; i < split.length; i++) {
            split[i] = arr[start + i];
        }
        return split;
    }

}
