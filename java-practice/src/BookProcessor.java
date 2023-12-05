public class BookProcessor extends Thread {
    private Book book;

    public BookProcessor(Book book) {
        this.book = book;
    }

    public void run() {
        this.book.printInfo();
    }
}