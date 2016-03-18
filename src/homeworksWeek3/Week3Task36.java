package homeworksWeek3;

import artcodeUtils.ArrayUtils;
import artcodeUtils.MatrixUtils;

/*3.6. Нули
		Требуется найти самую длинную непрерывную цепочку нулей  и единиц в последовательности цифр.
		Вход:
		10001101001
		Выход:
		(2,4) - цепочка нулей
		(5,6) - цепочка единиц*/

public class Week3Task36 {

    public static void main(String[] args) {

        int[] line = ArrayUtils.generateMasRandom0And1();
        System.out.println("\nLine is: ");
        ArrayUtils.printMas(line);

        int[] resMax0 = MatrixUtils.findMaxChairOf0(line);
        int[] resMax1 = MatrixUtils.findMaxChairOf1(line);

        System.out.println("\n\n(" + resMax0[0] + ", " + resMax0[1] + ") - max chair of 0");
        System.out.println("\n\n(" + resMax1[0] + ", " + resMax1[1] + ") - max chair of 1");
    }


    /*Найти самую длинную непрерывную цепочку 0 в последовательности цифр*/

    public static int[] findMaxChairOf0(int[] line) {

        int iBegin = 0;
        int iEnd = 0;
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < line.length; i++) {
            if (line[i] == 0) {
                count++;
            } else {
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
            iEnd = count > maxCount ? i + 1 : iEnd;
            iBegin = count > maxCount ? i + 2 - count : iBegin;
        }
        int[] res = {iBegin, iEnd};
        return res;
    }

    /*Найти самую длинную непрерывную цепочку 1 в последовательности цифр*/

    public static int[] findMaxChairOf1(int[] line) {

        int iBegin = 0;
        int iEnd = 0;
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < line.length; i++) {
            if (line[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
            iEnd = count > maxCount ? i + 1 : iEnd;
            iBegin = count > maxCount ? i + 2 - count : iBegin;
        }
        int[] res = {iBegin, iEnd};
        return res;
    }
}
