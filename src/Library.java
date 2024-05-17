public class Library {

    private String libraryItems;
    private String members;

    public Library() {
        this.libraryItems = "";
        this.members = "";
    }

    public void addItem(LibraryItem libraryItem) {
        libraryItems += libraryItem.toString() + "\n"; //returns a string containing info about each item in a new line
    }

    public void addMember(Member member) {
        members += member.toString() + "\n"; //returns a string containing info about each member in a new line
    }

    public void displayItems() {
        System.out.println("Library Items:");
        System.out.println(libraryItems);
    }

    public void displayMembers() {
        System.out.println("Library Members:");
        System.out.println(members);
    }
}

