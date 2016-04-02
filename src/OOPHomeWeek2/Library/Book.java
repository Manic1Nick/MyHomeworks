package OOPHomeWeek2.Library;

public abstract class Book {

    private String id;
    private String author;
    private int year;

    public Book(String id, String author, int year) {
        this.id = id;
        this.author = author;
        this.year = year;
    }

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }
}
