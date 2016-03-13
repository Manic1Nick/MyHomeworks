package homeworksWeek3;

import artcodeUtils.MatrixUtils;

/*3.3. Написать метод, который проверяет является ли строка палиндромом*/

public class Week3Task33 {

    public static void main(String[] args) {

        int[][] matrixBlank = MatrixUtils.genBlankMatrix();
        int[][] matrix = MatrixUtils.genMatrixRandom(matrixBlank);
        System.out.println("\nMatrix before: ");
        MatrixUtils.printMatrix(matrix);

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("\nIs line " + i + " palindrome?\n" + MatrixUtils.isPalindromOrNot(matrix[i]));
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
}
