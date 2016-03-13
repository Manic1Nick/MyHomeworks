package homeworksWeek3;

import artcodeUtils.MatrixUtils;

import java.util.Scanner;

/*3.2. Создать логическую матрицу по следующим критериям, если і равно j, то элементом будет true.*/

public class Week3Task32 {

    public static void main(String[] args) {

        boolean[][] matrixRes = MatrixUtils.genLogicMatrixIJTrue();
        System.out.println("\nMatrix is: ");
        MatrixUtils.printLogicMatrix(matrixRes);
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
}
