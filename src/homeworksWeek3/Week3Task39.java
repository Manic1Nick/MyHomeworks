package homeworksWeek3;

import artcodeUtils.MatrixUtils;

/*3.9. Умножить две матрицы.*/

public class Week3Task39 {

    public static void main(String[] args) {

        int[][] matrixBlank1 = MatrixUtils.genBlankMatrix();
        int[][] matrix1 = MatrixUtils.genMatrixRandom(matrixBlank1);
        System.out.println("\nMatrix 1 is: ");
        MatrixUtils.printMatrix(matrix1);

        int[][] matrixBlank2 = MatrixUtils.genBlankMatrix();
        int[][] matrix2 = MatrixUtils.genMatrixRandom(matrixBlank2);
        System.out.println("\nMatrix 2 is: ");
        MatrixUtils.printMatrix(matrix2);

        int[][] matrix3 = MatrixUtils.multiplay2Matrix(matrix1, matrix2);
        System.out.println("\nMatrix 3 is: ");
        MatrixUtils.printMatrix(matrix3);
    }

    /*Умножить 2 матрицы (количество столбцов первой РАВНО количеству строк второй!!!
    https://en.wikipedia.org/wiki/Matrix_multiplication
    */

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
}

