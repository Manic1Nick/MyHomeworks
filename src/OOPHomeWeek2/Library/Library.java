package OOPHomeWeek2.Library;

public class Library {

    private BookLibrary[] booksLibrary;
    private Reader[] readerList;

    public Library(BookLibrary[] booksLibrary, Reader[] readerList) {
        this.booksLibrary = booksLibrary;
        this.readerList = readerList;
    }

    public BookLibrary[] getBooksLibrary() {
        return booksLibrary;
    }

    public Reader[] getReaderList() {
        return readerList;
    }

    public void setBooksLibrary(BookLibrary[] booksLibrary) {
        this.booksLibrary = booksLibrary;
    }

    public void setReaderList(Reader[] readerList) {
        this.readerList = readerList;
    }

    //1) show all readers
    public void showReaders() {

        for (int i = 0; i < readerList.length; i++) {
            System.out.printf("reader id: %s, books in use: %d, inBlackList? %s\n",
                    readerList[i].getId(), readerList[i].getBooksReader().length,
                    readerList[i].getBlackList());
        }
    }

    //2) show all free books
    public void showBooksFree() {

        for (int i = 0; i < booksLibrary.length; i++) {

            if (booksLibrary[i].getFreeOrNot() == true) {
                System.out.printf("free? %s, book id: %s, author: %s, year: %d\n",
                        booksLibrary[i].getFreeOrNot(), booksLibrary[i].getId(),
                        booksLibrary[i].getAuthor(), booksLibrary[i].getYear());
            }
        }
    }

    //3) add new book to the library
    public BookLibrary[] addNewBookToLibrary(BookLibrary newBook) {

        BookLibrary[] newBooksLibrary = UtilsLibrary.increaseArrayBooks(booksLibrary, 1);
        newBooksLibrary[newBooksLibrary.length - 1] = newBook;

        return newBooksLibrary;
    }

    //4) add new reader to library
    public Reader[] addReaderToReaderList(Reader newReader) {

        Reader[] newReaderList = UtilsLibrary.increaseArrayReaders(readerList, 1);
        newReaderList[newReaderList.length - 1] = newReader;

        return newReaderList;
    }

    //5) give book to reader (if book is in library, free, no more 3 books to 1 reader)
    public void giveBookToReader(String idReader, String idBook) {

        int countIf = 0;

        for (int i = 0; i < booksLibrary.length; i++) {

            if (!idBook.equals(booksLibrary[i].getId())) {
                countIf++;

            } else {
                if (booksLibrary[i].getFreeOrNot() != true) {
                    countIf++;

                } else {
                    for (int j = 0; j < readerList.length; j++) {

                        if (!idReader.equals(readerList[j].getId())) {
                            countIf++;

                        } else {
                            if (readerList[j].getBlackList() == true) {
                                countIf++;

                            } else {
                                if (readerList[j].getBooksReader().length >= 3) {
                                    System.out.println("Reader can't use more than 3 books!");

                                } else {
                                    readerList[j].addBookToReader(booksLibrary[i]);
                                    booksLibrary[i].setFreeOrNot(false);
                                    booksLibrary[i].setUseOrNot(true);
                                }
                            }
                        }
                    }
                }
            }
        }

        if (countIf == booksLibrary.length) {
            System.out.println("This book wasn't found in free list books");
        }

        if (countIf == readerList.length) {
            System.out.println("This reader wasn't found in white list readers");
        }
    }

    //6) show all using books
    public void showBooksInUsing() {

        for (int i = 0; i < booksLibrary.length; i++) {

            if (booksLibrary[i].getUseOrNot() == true) {
                System.out.printf("using? %s, book id: %s, author: %s, year: %d\n",
                        booksLibrary[i].getUseOrNot(), booksLibrary[i].getId(),
                        booksLibrary[i].getAuthor(), booksLibrary[i].getYear());
            }
        }
    }

    //7)  show all books in 1 reader
    public void showBooksInReader(String idReader) {

        int countIf = 0;

        for (int i = 0; i < readerList.length; i++) {

            if (!idReader.equals(readerList[i].getId())) {
                countIf++;

            } else {
                for (int j = 0; j < readerList[i].getBooksReader().length; j++) {
                    System.out.printf("reader id: %s, book id: %s, author: %s, year: %d\n",
                            readerList[i].getId(), booksLibrary[j].getId(),
                            booksLibrary[j].getAuthor(), booksLibrary[j].getYear());
                }
            }

            if (countIf == readerList.length) {
                System.out.println("This reader wasn't found in list readers");
            }
        }
    }

    //8) add reader to black list
    public void addReaderToBlackList(String idReader) {

        int countIf = 0;

        for (int i = 0; i < readerList.length; i++) {

            if (!idReader.equals(readerList[i].getId())) {
                countIf++;

            } else {
                readerList[i].setBlackList(true);
            }

            if (countIf == readerList.length) {
                System.out.println("This reader wasn't found in list readers");
            }
        }
    }

    //9) show books from 1 author
    public void showBooksFromAuthor(String findAuthor) {

        int countIf = 0;

        for (int i = 0; i < booksLibrary.length; i++) {

            if (!findAuthor.equals(booksLibrary[i].getAuthor())) {
                countIf++;

            } else {
                System.out.printf("book id: %s, author: %s, year: %d, using? %s\n",
                        booksLibrary[i].getId(), booksLibrary[i].getAuthor(),
                        booksLibrary[i].getYear(), booksLibrary[i].getUseOrNot());
            }

            if (countIf == booksLibrary.length) {
                System.out.println("This author wasn't found in library");
            }
        }
    }

    //10) show all books year 2013 and later
    public void showBooksFrom2013() {

        int countIf = 0;

        for (int i = 0; i < booksLibrary.length; i++) {

            if (booksLibrary[i].getYear() < 2013) {
                countIf++;

            } else {
                System.out.printf("book id: %s, author: %s, year: %d, using? %s\n",
                        booksLibrary[i].getId(), booksLibrary[i].getAuthor(),
                        booksLibrary[i].getYear(), booksLibrary[i].getUseOrNot());
            }

            if (countIf == booksLibrary.length) {
                System.out.println("No find books year 2013-... in library");
            }
        }
    }

    public BookLibrary[] createBeginBooksLibrary(BookLibrary[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = new BookLibrary(UtilsLibrary.genIdBook(),
                    UtilsLibrary.genAuthorBook(),
                    UtilsLibrary.genYearBook(), true, false);
        }
        return array;
    }

    public Reader[] createBeginReaderList(Reader[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = new Reader(UtilsLibrary.genIdReader(),
                    UtilsLibrary.genBeginUsingBooksForReader(getBooksLibrary()), false);
        }
        return array;
    }
}
