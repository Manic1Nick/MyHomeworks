package OOPHomeWeek1.util;

import OOPHomeWeek1.model.Line;

public class LineUtils {

    public static String[] generateSymbolsArray(int size) {

        String[] symbols = new String[size];
        String possible = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789 ";

        for (int i = 0; i < size; i++) {
            symbols[i] = possible.charAt((int)Math.floor(Math.random() * possible.length())) + "";
        }
        return symbols;
    }

    public static Line generateLine(String[] symbols) {

        String line = "";

        for (int i = 0; i < symbols.length; i++) {
            line += symbols[i];
        }
        return new Line(line);
    }


    public static void printLine(Line line) {

        System.out.print(line);
    }

    public static void printLineFromArray(String[] symbols) {

        for (int i = 0; i < symbols.length; i++) {
            System.out.print(symbols[i]);
        }
    }

    public static Line lineToUpperCase(Line line) {

        String res = "" + line;

        return new Line(res.toUpperCase());
    }

    public static Line lineToLowerCase(Line line) {

        String res = "" + line;

        return new Line(res.toLowerCase());
    }

    public static Line findUnderLineInLine(Line line, int start, int end) {

        String res = "" + line;

        if (start < 0 && end < 0 && start > res.length() && end > res.length()) {
            System.out.print("Start end End must be inside line range!");
            return null;
        } else {
            return new Line(res.substring(start - 1, end));
        }
    }

    public static Line findUnderLineInLinePlusBrackets(Line line, int start, int end) {

        String res = "" + line;

        if (start < 0 && end < 0 && start > res.length() && end > res.length()) {
            System.out.print("Start end End must be inside line range!");
            return null;
        } else {
            String current = res.substring(start - 1, res.length());
            res = res.substring(0, start) + "[" + current + "]";
        }
        return new Line(res);
    }

    public static Line printLineFromArray(Line line) {

        String res = "" + line;
        res = res.replaceAll(" ", "");
        return new Line(res);
    }

    //метод для сравнения с другой строкой

}
