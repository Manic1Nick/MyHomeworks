package homeworksWeek3;

import artcodeUtils.MatrixUtils;

import java.util.Scanner;

/*3.13*. Написать морской бой(1 корабль). Размер поля указывает пользователь. При промахе показывать подсказку.*/

public class Week3Task313 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input side of square field:\n");
        int side = sc.nextInt();

        int[][] field = MatrixUtils.genField(side);     /*визуально поле будет состоять из цифр от 1 до 9, от 1 до 16, и т.д.*/

        System.out.println("The map is: ");
        MatrixUtils.printMatrix(field);

        int ship = (int) (Math.round(Math.random() * (side * side)));
        int fire = 0;
        int count = 0;


        for (int k = 0; k < 1;  ) {
            System.out.println("Fire! Enter number of sell: ");
            fire = sc.nextInt();
            count++;

            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[0].length; j++) {
                    if (field[i][j] == fire && fire == ship) {
                        field[i][j] = 1;
                        System.out.println("The map is: ");
                        MatrixUtils.printMatrix(field);
                        System.out.println("\n***************************************" +
                                           "\n     Congratulation! You are won!" +
                                           "\n      You have used " + count + " shots" +
                                           "\n               Game over" +
                                           "\n***************************************");
                        i = field.length;
                        j = field[0].length;
                        k = 1;

                    } else if (field[i][j] == fire) {
                        field[i][j] = 0;
                        System.out.println("The map is: ");
                        MatrixUtils.printMatrix(field);

                        if (ship - fire > 0) {
                            System.out.println("h e l p:" +
                                               "\nfind ship on BIGGER number than this place\n");
                        } else {
                            System.out.println("h e l p:" +
                                               "\nfind ship on SMALLER number than this place\n");
                        }
                        i = field.length;
                        j = field[0].length;
                        k = 0;
                    }
                }
            }
        }
    }


    /*Создание поля боя*/

    public static int[][] genField(int side) {

        int[][] field = new int[side][side];
        int count = 1;

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                field[i][j] = count++;       /*визуально поле будет состоять из цифр от 1 до 9, от 1 до 16, и т.д.*/
            }
        }
        return field;
    }
}

