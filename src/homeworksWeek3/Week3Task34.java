package homeworksWeek3;

import artcodeUtils.ArrayUtils;
import artcodeUtils.MatrixUtils;

/*3.4. Создать массив, который будет состоять из диагонали матрици

		1 3 5
		4 5 7  -  1 5 6
		4 5 6
*/

public class Week3Task34 {

    public static void main(String[] args) {

        int[][] matrixBlank = MatrixUtils.genBlankMatrix();
        int[][] matrix = MatrixUtils.genMatrixRandom(matrixBlank);
        System.out.println("\nMatrix before: ");
        MatrixUtils.printMatrix(matrix);

        int[] array = MatrixUtils.getArrayFromDiagonalMatrix(matrix);

        String res = ArrayUtils.convertMas(array);
        System.out.println("\nArray is:\n" + res);
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
}
