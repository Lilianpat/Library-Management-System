public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        // Adding items to the library
        Book book1 = new Book("Introduction to Object Oriented Programming", "O.R. Vincent", 168);
        DVD dvd1 = new DVD("Power Book", "50 Cent", "2hrs 12mins 5secs");
        Magazine magazine1 = new Magazine("NAtional Open University", "National Open University of Nigeria", "Study Guide for the Distance Learner");

        library.addItem(book1);
        library.addItem(dvd1);
        library.addItem(magazine1);

        library.displayItems(); //display library items


    Member myMember = new Member("Obuzor Lilian", 2020/252081); //creating a member

        myMember.borrowItem(book1); // borrowing an item

        myMember.borrowItem(book1); // trying to borrow an already borrowed item

        myMember.returnItem(book1);  // returning an item

        library.displayItems(); //displaying final library items
    }
}
