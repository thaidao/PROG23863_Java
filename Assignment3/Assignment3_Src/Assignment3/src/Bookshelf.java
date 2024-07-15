import java.util.ArrayList;
import java.util.List;

public class Bookshelf {
    private List<Book> books = new ArrayList<>(10);

    public void addBookToBookshelf(Book book) {
        if (books.size() < 10) {
            books.add(book);
        } else {
            System.out.println("Bookshelf is full!");
        }
    }

    public Book retrieveBookFromBookshelf(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                return book;
            }
        }
        System.out.println("Book not found!");
        return null;
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    public int howManyBooks() {
        return books.size();
    }
}
