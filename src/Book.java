public class Book extends LibraryItem {

    //properties
    public int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        super(title, author);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {

        return numberOfPages;
    }

    public String toString() {
        return " Book1: " + numberOfPages;
    }

}




