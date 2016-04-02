package OOPHomeWeek2.Library;

import java.util.Scanner;

public class TestLibrary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nInput number of books in your library:");
        int numBooks = sc.nextInt();
        System.out.println("\nInput begin number of readers:");
        int numReaders = sc.nextInt();

        Library library = new Library(new BookLibrary[numBooks], new Reader[numReaders]);

        //generate books to library
        library.createBeginBooksLibrary(library.getBooksLibrary());

        //generate begin list of readers
        library.createBeginReaderList(library.getReaderList());

        //working menu
        for (int i = 0; i < 1; ) {

            System.out.println("\nInput number of action:" +
                    "\n[1] Show list all readers" +
                    "\n[2] Show list free books" +
                    "\n[3] Adding new book in library" +
                    "\n[4] Adding new readers in library" +
                    "\n[5] Give book from library to reader" +
                    "\n[6] Show books using by ALL readers" +
                    "\n[7] Show books using by 1 reader" +
                    "\n[8] Add reader to blacklist" +
                    "\n[9] Show books by author" +
                    "\n[13] Show books from year 2013 and later" +
                    "\n[0] Exit");

            int input = sc.nextInt();

            if (input == 0) {
                i = 1;
            }

            if (input == 1) {
                System.out.println("\nYour readers are:");
                library.showReaders();
            }

            if (input == 2) {
                System.out.println("\nFree books are:");
                library.showBooksFree();
            }

            if (input == 3) {
                System.out.println("Input author:");
                String yourAuthor = sc.next();
                System.out.println("Input year:");
                int yourYear = sc.nextInt();
                library.setBooksLibrary(library.addNewBookToLibrary(new BookLibrary(UtilsLibrary.genIdBook(),
                        yourAuthor, yourYear, true, false)));
            }

            if (input == 4) {
                System.out.println("Input number of new readers:");
                int newReaders = sc.nextInt();
                for (int j = 0; j < newReaders; j++) {
                    library.setReaderList(library.addReaderToReaderList(new Reader(UtilsLibrary.genIdReader(),
                            UtilsLibrary.genEmptyPlaceInBooksReader(), false)));
                }
            }

            if (input == 5) {
                System.out.println("Input id reader:");
                String idReader = sc.next();
                System.out.println("Input id book:");
                String idBook = sc.next();
                library.giveBookToReader(idReader, idBook);
            }

            if (input == 6) {
                System.out.println("\nAll using books are:");
                library.showBooksInUsing();
            }

            if (input == 7) {
                System.out.println("Input id reader:");
                String idReader = sc.next();
                library.showBooksInReader(idReader);
            }

            if (input == 8) {
                System.out.println("Input id reader for adding to blacklist:");
                String idReaderClaim = sc.next();
                library.addReaderToBlackList(idReaderClaim);
            }

            if (input == 9) {
                System.out.println("Input author from Upper letter:");
                String author = sc.next();
                library.showBooksFromAuthor(author);
            }

            if (input == 13) {
                System.out.println("\nBooks from year 2013 and later in library are:");
                library.showBooksFrom2013();
            }
        }
    }
}