public class DVD extends LibraryItem {

    private String producer;
    private String duration;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public DVD(String title, String producer, String duration) {
        super(title, "");
        this.producer = producer;
        this.duration = duration;
    }

    public String toString() {
        return " Duration: " + duration;
    }
}

