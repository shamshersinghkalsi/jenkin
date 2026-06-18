package Library;

public class Ebook extends Book {
    double fileSize;

    public Ebook(int bookId, String title, String author, double price, double fileSize) {
        super(bookId, title, author, price);
        this.fileSize = fileSize;
    }

    @Override
    public void borrowBook(String borrowerName) {
      System.out.println(getTitle()+ " is downloaded by " +
              borrowerName+ " size of file " + fileSize+ " MB" );
        System.out.println("copies never runs out");
    }
}
