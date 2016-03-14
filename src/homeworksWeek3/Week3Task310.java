package homeworksWeek3;

/*3.10*. Удалить из предложения слова которые повторяются.*/

import artcodeUtils.StringUtils;

public class Week3Task310 {

    public static void main(String[] args) {

        String line = StringUtils.enterStringLine();
        System.out.println("\nLine without similar words is:\n" + StringUtils.deleteSameWordsInLine(line));

    }

    /*Поиск и удаление слов которые повторяются*/

    public static String deleteSameWordsInLine(String line) {

        String[] lineParts = line.split(" ");
        String res = new String();

        for (int i = 0; i < lineParts.length; i++) {
            for (int j = i + 1; j < lineParts.length; j++) {
                if (lineParts[i].length() == lineParts[j].length()) {
                    lineParts[j] = lineParts[i].substring(0, lineParts[i].length()).equals
                                  (lineParts[j].substring(0, lineParts[j].length())) ? "" : lineParts[j] ;
                }
            }
            if (lineParts[i] != "") {
                res += lineParts[i] + " ";
            }
        }
        return res;
    }
}
