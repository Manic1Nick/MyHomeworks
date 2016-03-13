package artcodeUtils;

import java.util.Scanner;

public class MatrixUtils {

    /*Создать пустую матрицу с вводом параметров (строки, столбцы)*/

    public static int[][] genBlankMatrix() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of rows: ");
        int rows = sc.nextInt();
        System.out.println("Input size of columns: ");
        int columns = sc.nextInt();

        int[][] matrix = new int[rows][columns];
        return matrix;
    }

    /*Заполнение матрицы случайными числами с заданным рангом*/

    public static int[][] genMatrixRandom(int[][] matrix) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input range of array: ");
        int range = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * range);
            }
        }
        return matrix;
    }

    /*Вывести матрицу чисел на печать*/

    public static void printMatrix(int[][] matrix) {

        String res = "";

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                res = res + matrix[i][j] + ", ";
            }

            System.out.println(res);
            res = "";
        }
        System.out.println("\n");
    }


    /*Создать логическую матрицу с вводом параметров (строки, столбцы)
    * if i == j ----> true*/

    public static boolean[][] genLogicMatrixIJTrue() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of rows: ");
        int rows = sc.nextInt();
        System.out.println("Input size of columns: ");
        int columns = sc.nextInt();

        boolean[][] matrix = new boolean[rows][columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i - j != 0 ? false : true ;
            }
        }
        return matrix;
    }




     /*Вывести логическую матрицу на печать*/

    public static void printLogicMatrix(boolean[][] matrix) {

        String res = "";

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                res = res + matrix[i][j] + ", ";
            }

            System.out.println(res);
            res = "";
        }
    }


    /*Проверка является ли строка палиндромом?*/

    public static boolean isPalindromOrNot(int[] line) {

        int count = 0;

        for (int i = 0; i < line.length; i++) {
            if (line[i] == line[line.length - i - 1]) {
                count++;
            }
        }
        return count != line.length ? false : true;
    }


    /*Получение массива из диагонали матрицы*/

    public static int[] getArrayFromDiagonalMatrix(int[][] matrix) {

        int[] array = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i - j == 0) {
                    array[i] = matrix[i][j];
                }
            }
        }
        return array;
    }

    /*Определение индекса наибольшей строки матрицы*/

    public static int getIndexMaxLineMatrix(int[][] matrix) {

        int[] array = new int[matrix.length];
        int imax = 0;
        int sum = array[0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[i] += matrix[i][j];
            }
            sum = Math.max(sum, array[i]);
            imax = sum == array[i] ? i : imax ;
        }
        return imax;
    }


    /*Определение индекса наименьшей строки матрицы*/

    public static int getIndexMinLineMatrix(int[][] matrix) {

        int[] array = new int[matrix.length];
        int imin = 0;
        int sum = (int) Math.pow(2, 67);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[i] += matrix[i][j];
            }
            sum = Math.min(sum, array[i]);
            imin = sum == array[i] ? i : imin ;
        }
        return imin;
    }


    /*Определение индекса наибольшего столбца матрицы*/

    public static int getIndexMaxColumnMatrix(int[][] matrix) {

        int[] array = new int[matrix[0].length];
        int imax = 0;
        int sum = array[0];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                array[i] += matrix[j][i];
            }
            sum = Math.max(sum, array[i]);
            imax = sum == array[i] ? i : imax ;
        }
        return imax;
    }


    /*Определение индекса наименьшего столбца матрицы*/

    public static int getIndexMinColumnMatrix(int[][] matrix) {

        int[] array = new int[matrix[0].length];
        int imin = 0;
        int sum = (int) Math.pow(2, 67);

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                array[i] += matrix[j][i];
            }
            sum = Math.min(sum, array[i]);
            imin = sum == array[i] ? i : imin ;
        }
        return imin;
    }

    /*Поменять местами строки в матрице*/

    public static int[][] replaceLinesInMatrix(int[][] matrix, int line1, int line2) {

        int[][] matrixRepLine = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixRepLine[i][j] = line1 != i ? matrix[i][j] : matrix[line2][j];
                matrixRepLine[i][j] = line2 != i ? matrixRepLine[i][j] : matrix[line1][j];
            }
        }
        return matrixRepLine;
    }

    /*Поменять местами столбцы в матрице*/

    public static int[][] replaceColumnesInMatrix(int[][] matrix, int column1, int column2) {

        int[][] matrixRepColumn = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrixRepColumn[j][i] = column1 != i ? matrix[j][i] : matrix[j][column2];
                matrixRepColumn[j][i] = column2 != i ? matrixRepColumn[j][i] : matrix[j][column1];
            }
        }
        return matrixRepColumn;
    }


    /*Найти самую длинную непрерывную цепочку 0 в последовательности цифр*/

    public static void findMaxChairOf0(int[] line) {

        int iBegin = 0;
        int iEnd = 0;
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < line.length; i++) {
            if (line[i] == 0) {
                count++;
            } else {
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
            iEnd = count > maxCount ? i + 1 : iEnd;
            iBegin = count > maxCount ? i + 2 - count : iBegin;
        }
        System.out.println("\n\n(" + iBegin + ", " + iEnd + ") - max chair of 0");

    }


    /*Найти самую длинную непрерывную цепочку 1 в последовательности цифр*/

    public static void findMaxChairOf1(int[] line) {

        int iBegin = 0;
        int iEnd = 0;
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < line.length; i++) {
            if (line[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
            iEnd = count > maxCount ? i + 1 : iEnd;
            iBegin = count > maxCount ? i + 2 - count : iBegin;
        }
        System.out.println("\n(" + iBegin + ", " + iEnd + ") - max chair of 1");
    }

    /*Умножить 2 матрицы (количество строк первой РАВНО количеству столбцов второй!!!)*/

    public static int[][] multiplay2Matrix(int[][] matrix1, int[][] matrix2) {

        if (matrix1[0].length != matrix2.length) {
            System.out.println("Number of columns matrix 1 must be equals number rows of matrix 2 !\n");
        }

        int[][] matrix3 = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix3;
    }

    /*Создать числовую матрицу с заданными количеством строк, столбцов, и рангом
    Записать в матрицу в четные строки случайные четные значения,
    в нечетные строки - случайные нечетные значения*/
    public static int[][] genMatrixOddEven(int rows, int columns, int range) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = i %2 == 0 ? MatrixUtils.genEvenRandom(range) : MatrixUtils.genOddRandom(range);
            }
        }
        return matrix;
    }

    /*Генерировать НЕпарные случайные числа*/
    public static int genOddRandom(int range) {
        int random = (int) (Math.random() * range);
        random = random %2 != 0 ? random : random + 1;
        return random;
    }

    /*Генерировать парные случайные числа*/
    public static int genEvenRandom(int range) {
        int random = (int) (Math.random() * range);
        random = random %2 == 0 ? random : random + 1;
        return random;
    }




    /*Ввод данных в массив*/
    public static int enterRowsInArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of rows: ");
        int rows = sc.nextInt();
        return rows;
    }

    public static int enterColumnsInArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input size of columns: ");
        int columns = sc.nextInt();
        return columns;
    }

    public static int enterRangeInArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input range of array: ");
        int range = sc.nextInt();
        return range;
    }

}
