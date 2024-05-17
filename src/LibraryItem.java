public class LibraryItem {
    private String title;
    private String author;
    private boolean available;

    public LibraryItem(String title, String author) {
    }

    public String toString() {
        return title + " by " + author; //returns the title of the item followed by the author's name
    }

    public void LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public boolean borrow() {
        if (available) {
            available = false;
            return true;
        } else {
            System.out.println("Sorry, this item is not available");
            return false;
        }
    }

    public void returnItem() {
        available = true;
        System.out.println("Thank you for returning the item.");
    }


}
