package homeworksWeek3;

import artcodeUtils.MatrixUtils;

/*3.1. Заменить все числа, которые делятся на 5 без остачи в двухмерной матрице на 8*/

public class Week3Task31 {

    public static void main(String[] args) {

        int[][] matrixBlank = MatrixUtils.genBlankMatrix();
        int[][] matrix = MatrixUtils.genMatrixRandom(matrixBlank);
        System.out.println("\nMatrix before: ");
        MatrixUtils.printMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] %5 == 0 ? 8 : matrix[i][j];
            }
        }
        System.out.println("\nMatrix after: ");
        MatrixUtils.printMatrix(matrix);
    }
}
