public class Magazine extends LibraryItem {

    private String article;

    public Magazine(String title, String author, String article) {
        super(title, author);
        this.article = article;
    }

    public String toString() {
        return  " Article: " + article;
    }
}