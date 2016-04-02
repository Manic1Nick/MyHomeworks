package OOPHomeWeek2.Library;

public class UtilsLibrary {

    //increase array of objects
    public static BookLibrary[] increaseArrayBooks(BookLibrary[] oldArray, int addSize) {

        BookLibrary[] newArray = new  BookLibrary[oldArray.length + addSize];

        for (int i = 0; i < newArray.length - addSize; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }

    //increase array of readers
    public static Reader[] increaseArrayReaders(Reader[] oldArray, int addSize) {

        Reader[] newArray = new Reader[oldArray.length + addSize];

        for (int i = 0; i < newArray.length - addSize; i++) {
            newArray[i] = oldArray[i];
        }
        return newArray;
    }



    //generate new idBook
    public static String genIdBook() {

        String id = new String("" + (int) (Math.random() * 10000));

        if (id.length() == 3) {
            id = "0" + id;
        }

        if (id.length() == 2) {
            id = "00" + id;
        }

        if (id.length() == 1) {
            id = "000" + id;
        }

        return id;
    }

    //generate author book
    public static String genAuthorBook() {

        String[] authors = {"Christie", "Pushkin", "Chekhov", "Doyle", "Grimm",
                "Dickens", "Defoe", "Poe", "Miller", "Dreiser"};

        String author = "" + (authors[(int) (Math.random() * authors.length)]);

        return author;
    }

    //generate year book
    public static int genYearBook() {

        int year = 1950 + ((int) (Math.random() * 66));

        return year;
    }

    //generate new idReader
    public static String genIdReader() {

        String id = new String("" + (int) (Math.random() * 1000));

        if (id.length() == 3) {
            id = "R" + id;
        }

        if (id.length() == 2) {
            id = "R0" + id;
        }

        if (id.length() == 1) {
            id = "R00" + id;
        }

        return id;
    }

    //create random begin bookLibrary[] for reader
    public static BookLibrary[] genBeginUsingBooksForReader(BookLibrary[] allBooks) {

        int randomSize = (int)(Math.round(Math.random() * 3));
        BookLibrary[] beginBooks1Reader = new BookLibrary[randomSize];

        for (int i = 0; i < beginBooks1Reader.length; ) {
            int randomBook = 1 + (int)(Math.random() * (allBooks.length - 1));
            if (allBooks[randomBook].getFreeOrNot() == true) {
                beginBooks1Reader[i] = allBooks[randomBook];
                allBooks[randomBook].setFreeOrNot(false);
                allBooks[randomBook].setUseOrNot(true);
                i++;
            }
        }
        return beginBooks1Reader;
    }

    //create empty place for books for adding reader
    public static  BookLibrary[] genEmptyPlaceInBooksReader() {

        BookLibrary[] place = new BookLibrary[0];
        return place;
    }

}