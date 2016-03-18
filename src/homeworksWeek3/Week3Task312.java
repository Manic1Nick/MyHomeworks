package homeworksWeek3;

/*3.12*. Строки. Ввод пароля.
		Написать программу ввода пароля пользователя. Пользователь вводит пароль 2 раза. Пароль должен удовлетворять следующим требованиям:
		- длинна пароля должна быть от 8 до 20 символов
		- в пароле должны быть как маленькие так и большие буквы
		- должны быть цифры
		- не должен содержать слов 'password', 'pass', 'gfhjkm'
		- генерировать случайный пароль используя символы: a-z A-Z 0-9*/


import artcodeUtils.StringUtils;

import java.util.Scanner;

public class Week3Task312 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String pass = "";
        int attempts = 2;

        for (int i = 0; i < attempts; ) {

            System.out.println("\nYou have " + (attempts - i) + " attempt(s)." +
                               "\nInput password from 8 to 20 symbols: ");
            pass = sc.nextLine();

            i = (StringUtils.checkPassLength(pass, 8, 20) == false ||
                    StringUtils.checkPassLowerUpper(pass) == false ||
                    StringUtils.checkPassNumbersIncl(pass) == false ||
                    StringUtils.checkPassWordsIncl(pass) == false) ? i + 1 : attempts + 1 ;

            attempts = i == attempts ? 0 : attempts ;
        }

        if (attempts == 0) {
            System.out.println("\nYour attempts over. Password will be generate random.");
            pass = StringUtils.genRandomPass();
        }

        System.out.println("Your password is: " + pass);
    }



    /*Проверяем пароль*/

    public static boolean checkPassLength(String pass, int minLength, int maxLength) {

        int length = pass.length();
        boolean res = length >= minLength && length <= maxLength;
        if (res == false) {
            System.out.println("Password must be from 8 to 20 symbols!");
        }
        return res;
    }

    public static boolean checkPassLowerUpper(String pass) {

        boolean res = (!pass.equals(pass.toLowerCase()) &&
                !pass.equals(pass.toUpperCase())) ? true : false ;
        if (res == false) {
            System.out.println("Password must have lower and upper letters!");
        }
        return res;
    }

    public static boolean checkPassNumbersIncl(String pass) {

        int length = pass.length();

        for (int i = 0; i < 10; i++) {
            String x = i + "";
            boolean res = (pass.substring(0, length).contains(x)) ? true : false ;
            if (res == true) {
                return res;
            }
        }
        System.out.println("Password must have numbers!");
        return false;
    }

    public static boolean checkPassWordsIncl(String pass) {

        int length = pass.length();
        boolean res = (!pass.contains("password") || !pass.contains("pass") || !pass.contains("gfhjkm")) ? true : false ;
        if (res == false) {
            System.out.println("Password must not have words 'password', 'pass', 'gfhjkm'!");
        }
        return res;
    }

    /*Генерируем случайный пароль*/

    public static String genRandomPass() {

        int length = (int) (Math.random() * 12 + 8);
        String pass = "";

        String possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < length; j++) {
                pass += possible.charAt((int)Math.floor(Math.random() * possible.length()));
            }

            if (StringUtils.checkPassNumbersIncl(pass) == false) {
                i = 0;
            }
        }
        return pass;
    }

}
