package homeworksWeek3;

import artcodeUtils.MatrixUtils;

/*3.5.
	     b) Поменять наибольший и наименьший столбик в двухмерном массиве.*/

public class Week3Task35B {

    public static void main(String[] args) {

        int[][] matrixBlank = MatrixUtils.genBlankMatrix();
        int[][] matrix = MatrixUtils.genMatrixRandom(matrixBlank);
        System.out.println("\nMatrix before: ");
        MatrixUtils.printMatrix(matrix);

        int imax = MatrixUtils.getIndexMaxColumnMatrix(matrix);
        int imin = MatrixUtils.getIndexMinColumnMatrix(matrix);
        System.out.println("\nIndex of max column: " + imax + "\nIndex of min column: " + imin);

        int[][] matrixRepColumn = MatrixUtils.replaceColumnesInMatrix(matrix, imax, imin);
        System.out.println("\nMatrix after replace columnes: ");
        MatrixUtils.printMatrix(matrixRepColumn);
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
}
