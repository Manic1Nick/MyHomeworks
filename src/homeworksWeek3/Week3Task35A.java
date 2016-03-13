package homeworksWeek3;

import artcodeUtils.MatrixUtils;

/*3.5. а) Поменять наибольшую строку массива с наименьшей в двухмерном массиве. (Размер - сумма элементов в строке)
	     */

public class Week3Task35A {

    public static void main(String[] args) {

        int[][] matrixBlank = MatrixUtils.genBlankMatrix();
        int[][] matrix = MatrixUtils.genMatrixRandom(matrixBlank);
        System.out.println("\nMatrix before: ");
        MatrixUtils.printMatrix(matrix);

        int imax = MatrixUtils.getIndexMaxLineMatrix(matrix);
        int imin = MatrixUtils.getIndexMinLineMatrix(matrix);
        System.out.println("\nIndex of max line: " + imax + "\nIndex of min line: " + imin);

        int[][] matrixRepLine = MatrixUtils.replaceLinesInMatrix(matrix, imax, imin);
        System.out.println("\nMatrix after replace lines: ");
        MatrixUtils.printMatrix(matrixRepLine);
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
}
