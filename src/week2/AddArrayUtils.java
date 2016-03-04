package week2;

public class AddArrayUtils {

    /*2.1 Инвертировать массив (без использования допольнительного массива)*/

    public static int[] invertArray(int[] arr) {

        int numCur = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            numCur = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = numCur;
        }
        return arr;
    }


    /*2.2 Проверить или является число простым*/

    public static boolean numberPrimeOrNot(int number) {

        int countYes = 0;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                countYes++;
            }
        }
        boolean res = (countYes == 0);
        System.out.println("\nIs number " + number + " prime?\n" + res);

        return res;
    }


	/*2.3 Посчитать колличество букв 'a' в строке (искомый символ может быть разным)*/

    public static int countLetterInLine(String line, String letter) {

        int count = 0;

        if (letter.length() != 1 ) {
            System.out.println("Letter must have 1 symbol!");

        } else {
            for (int i = 0; i < line.length(); i++) {
                if (line.substring(i, i + 1).equals(letter)) {
                    count++;
                }
            }
        }
        return count;
    }


    /*2.4 Сдвинуть массив на заданное количество позиций // {1,2,3,4,5} -> 2 = {4,5,1,2,3}; {1,2,3,4,5} -> 3 = {3,4,5,1,2}
		Количество позиций и массив указывает пользователь*/

    public static int[] moveArray(int[] arr, int move) {

        int[] arrAdd = new int[arr.length + move];

        for (int i = 0; i < arr.length; i++) {
            arrAdd[i + move] = arr[i];
        }
        for (int i = 0; i < (arrAdd.length - arr.length); i++) {
            arrAdd[i] = arr[arr.length - move + i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arrAdd[i];
        }
        return arr;
    }


    /*2.5 Заменить в строке все символы 'a' на '@' и вывести новую строку
    // "array is a data type" -> "@rr@y is @ d@t@ type"*/

    public static String replaceAllA (String line) {

        for (int i = 0; i < line.length(); i++) {
            line = line.replace("a", "@");
        }
        return line;
    }

}
