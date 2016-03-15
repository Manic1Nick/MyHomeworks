package homeworksWeek3;

/*3.11*. Повернуть матрицу(Двухмерный массив). Матрица квадратная. Пользователь вводит угол кратный 90.*/

import artcodeUtils.MatrixUtils;

import java.util.Scanner;

public class Week3Task311 {

    public static void main(String[] args) {

        int[][] matrixBlank = MatrixUtils.genBlankMatrix();
        int[][] matrix = MatrixUtils.genMatrixRandom(matrixBlank);
        System.out.println("\nMatrix before: ");
        MatrixUtils.printMatrix(matrix);

        matrix = MatrixUtils.turnSquareMatrix(matrix);

        System.out.println("\nMatrix after: ");
        MatrixUtils.printMatrix(matrix);
    }

    /*Повернуть квадратную матрицу на заданный угол, кратный 90 градусов*/

    public static int[][] turnSquareMatrix(int[][] matrix) {

        if (matrix.length != matrix[0].length) {
            System.out.println("Number of rows must be equals number of columns!\n");
            return null;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Input angle by multiples of 90 degrees: ");
        int angle = sc.nextInt();

        if (angle % 90 != 0) {
            System.out.println("The angle must be multiples of 90 degrees!\n");
            return null;
        }

        int[][] res = new int[matrix.length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (angle == 90 || angle % (90 + 360) == 0) {
                    res[i][j] = matrix[matrix.length - 1 - j][i];
                } else if (angle == 180 || angle % (180 + 360) == 0) {
                    res[i][j] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                } else if (angle == 270 || angle % (270 + 360) == 0) {
                    res[i][j] = matrix[j][matrix.length - 1 - i];
                } else if (angle == 360 || angle % (360) == 0) {
                    res[i][j] = matrix[i][j];
                }
            }
        }
        return res;
    }
}
