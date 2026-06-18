package Library;

public class Main {
    public static void main(String[] args) {
        Book[] book = new Book[4];
        book[0] = new PhysicalBook(124, " Hobbit ", " JRR Tolkien ", 140, 5, 2);
        book[1] = new PhysicalBook(125, " Hobbit 2 ", " JRR Tolkien ", 160, 2, 6);
        book[2] = new Ebook(126, " Hobbit 3 ", " JRR Tolkien ", 75, 40);
        book[3] = new Ebook(126, " Hobbit ", " JRR Tolkien ", 75, 46);

        for (int i = 0; i < 4; i++) {

            book[i].borrowBook("Ram");

        }
        for (int i = 0; i < 4; i++) {


            if (book[i] instanceof Returnable) {
                ((Returnable) book[i]).returnBook("Sham");
            }
        }
    }
}
