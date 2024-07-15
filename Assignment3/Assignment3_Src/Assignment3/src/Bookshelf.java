public class Bookshelf {
    // Contains an array of 10 Book objects
    private Book[] books = new Book[10];

    public void addBookToBookshelf(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
        System.out.println("Bookshelf is full!");
    }

    public Book retrieveBookFromBookshelf(String title) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null && books[i].getTitle().equals(title)) {
                Book book = books[i];
                books[i] = null;
                return book;
            }
        }
        System.out.println("Book not found!");
        return null;
    }

    public void displayBooks() {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.getTitle());
            }
        }
    }

    public int howManyBooks() {
        int count = 0;
        for (Book book : books) {
            if (book != null) {
                count++;
            }
        }
        return count;
    }
}