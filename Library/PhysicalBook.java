package Library;

public class PhysicalBook extends Book implements Returnable {
    int shelfLocation;
    int availableCopies;

    public PhysicalBook(int bookId, String title, String author, double price, int shelfLocation, int availableCopies) {
        super(bookId, title, author, price);
        this.shelfLocation = shelfLocation;
        this.availableCopies = availableCopies;
    }

    @Override
    public void borrowBook(String borrowerName) {

        if (availableCopies == 0) {
        //    throw new BookNotAvailableException(" No copies available ");
        } availableCopies--;
            System.out.println(getTitle() + " is borrowed by " +
                    borrowerName + " available number of copies " +
                    availableCopies);
        }


        @Override
        public void returnBook (String borrowerName){
            availableCopies++;
            System.out.println(getTitle() + " is returned by " + borrowerName +
                    " available number of copies " + availableCopies);
        }
    }

