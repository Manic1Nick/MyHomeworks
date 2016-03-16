package homeworksWeek3;

import artcodeUtils.StringUtils;

import java.util.Scanner;

/*3.12*. Строки. Ввод пароля.
		Написать программу ввода пароля пользователя. Пользователь вводит пароль 2 раза. Пароль должен удовлетворять следующим требованиям:
		- длинна пароля должна быть от 8 до 20 символов
		- в пароле должны быть как маленькие так и большие буквы
		- должны быть цифры
		- не должен содержать слов 'password', 'pass', 'gfhjkm'
		- генерировать случайный пароль используя символы: a-z A-Z 0-9*/

public class Week3Task312 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String pass = "";
        int attempts = 2;

        for (int i = 0; i < attempts; ) {

            if (i == 0) {
                System.out.println("\nYou have " + attempts + " attempts.");
            }

            if (i == 1) {
                System.out.println("\nTry again! But you have only 1 attempt");
            }

            System.out.println("\nInput password from 8 to 20 symbols: ");
            pass = sc.nextLine();

            if (StringUtils.checkPassLength(pass, 8, 20) == false) {
                System.out.println("Password must be from 8 to 20 symbols!");
                i++;
            } else {

                if (StringUtils.checkPassLowerUpper(pass) == false) {
                    System.out.println("Password must have lower and upper letters!");
                    i++;
                } else {

                    if (StringUtils.checkPassNumbersIncl(pass) == false) {
                        System.out.println("Password must have numbers!");
                        i++;
                    } else {

                        if (StringUtils.checkPassWordsIncl(pass) == false) {
                            System.out.println("Password must not have words 'password', 'pass', 'gfhjkm'!");
                            i++;
                        } else {

                            System.out.println("Your password is: " + pass);
                            i = attempts;
                            attempts = 0;
                        }
                    }
                }
            }

        }

        if (attempts == 0) {
            System.out.println("\nIf you are satisfied with this password, enter Y." +
                    "\nIf you are not satisfied with this password, you can try generate random password," +
                    "\nFor generate random password enter ANY key exception Y:\n");
            if (!sc.next().equalsIgnoreCase("y"))  {
                pass = StringUtils.genRandomPass();
            }

        } else {
            System.out.println("\nYour attempts over. Password will be generate random.");
            pass = StringUtils.genRandomPass();
        }
        System.out.println("Your password is: " + pass);



/*      А так последний блок почему-то не получился........

        String answer = sc.next();w

        if (!answer.equals("Y") || !answer.equals("y"))  {
            pass = StringUtils.genRandomPass();
        }
        System.out.println("Your password is: " + pass);
        */
    }

    public static boolean checkPassLength(String pass, int minLength, int maxLength) {

        int length = pass.length();
        boolean res = length >= minLength && length <= maxLength;
        return res;
    }

    public static boolean checkPassLowerUpper(String pass) {

        boolean res = (!pass.equals(pass.toLowerCase()) &&
                       !pass.equals(pass.toUpperCase())) ? true : false ;
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
        return false;
    }

    public static boolean checkPassWordsIncl(String pass) {

        int length = pass.length();
        boolean res = (!pass.contains("password") || !pass.contains("pass") || !pass.contains("gfhjkm")) ? true : false ;
        return res;
    }

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
