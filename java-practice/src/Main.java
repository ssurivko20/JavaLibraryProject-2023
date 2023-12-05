public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Заглавие 1", "Автор 1", 2000);
        Book book2 = new Book("Заглавие 2", "Автор 2", 2005);
        Book book3 = new Book("Заглавие 3", "Автор 3", 2010);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Reader reader = new Reader("Име на читателя");

        reader.borrowBook(library, book1);
        reader.borrowBook(library, book2);

        reader.displayBorrowedBooks();

        reader.returnBook(library, book1);

        reader.displayBorrowedBooks();
    }
}