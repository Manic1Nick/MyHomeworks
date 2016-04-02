package OOPHomeWeek2.Library;

public class BookLibrary extends Book {

    private boolean freeOrNot;
    private boolean useOrNot;

    public BookLibrary(String id, String author, int year, boolean freeOrNot, boolean useOrNot) {
        super(id, author, year);
        this.freeOrNot = freeOrNot;
        this.useOrNot = useOrNot;
    }

    public boolean getFreeOrNot() {
        return freeOrNot;
    }

    public boolean getUseOrNot() {
        return useOrNot;
    }

    public void setFreeOrNot(boolean freeOrUse) {
        this.freeOrNot = freeOrUse;
    }

    public void setUseOrNot(boolean useOrNot) {
        this.useOrNot = useOrNot;
    }
}