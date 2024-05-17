public class Member extends Library {

    private String name;
    private int memberId;

    private String borrowedItems;



    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public void borrowItem(LibraryItem libraryItem) {
        if (libraryItem.borrow()) {
            borrowedItems += libraryItem.toString() + "\n";
            System.out.println("Item borrowed successfully.");
        } else {
        }
    }

    public void returnItem(LibraryItem libraryItem) {
        if (borrowedItems != null && borrowedItems.contains(libraryItem.toString())) { // Checking for null
            libraryItem.returnItem();
            borrowedItems = borrowedItems.replace(libraryItem.toString() + "\n", "");
            System.out.println("Item returned successfully.");
        } else {
            System.out.println("You haven't borrowed this item.");
        }
    }

    public String toString() {
        return "Member: " + name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getBorrowedItems() {
        return borrowedItems;
    }
    public void setBorrowedItems(String borrowedItems) {
        this.borrowedItems = borrowedItems;
    }
}
