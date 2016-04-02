package OOPHomeWeek2.Library;

public class Reader {

    private String id;
    private BookLibrary[] booksReader;
    private boolean blackList;

    public Reader(String id, BookLibrary[] booksReader, boolean blackList) {
        this.id = id;
        this.booksReader = booksReader;
        this.blackList = blackList;
    }

    public String getId() {
        return this.id;
    }

    public BookLibrary[] getBooksReader() {
        return this.booksReader;
    }

    public boolean getBlackList() {
        return this.blackList;
    }

    public void setBlackList(boolean claim) {
        this.blackList = claim;
    }

    public void setBooksReader(BookLibrary[] booksReader) {
        this.booksReader = booksReader;
    }

    public BookLibrary[] addBookToReader(BookLibrary newBook) {

        BookLibrary[] newBooksReader = new BookLibrary[booksReader.length + 1];  //use utils increase array ?

        for (int i = 0; i < newBooksReader.length - 1; i++) {
            newBooksReader[i] = booksReader[i];
        }
        newBooksReader[newBooksReader.length - 1] = newBook;
        setBooksReader(newBooksReader);

        return  newBooksReader;
    }

    public BookLibrary[] returnBookToLibrary(BookLibrary newBook) {

        BookLibrary[] newBooksReader = booksReader.length >= 1 ?
                new BookLibrary[booksReader.length - 1] : new BookLibrary[0];

        if (booksReader.length == 0) {
            System.out.println("Reader don't have books!");
            return booksReader;

        } else {
            for (int i = 0 ; i < newBooksReader.length; i++) {
                newBooksReader[i] = booksReader[i];
            }
        }
        return  newBooksReader;
    }

}
