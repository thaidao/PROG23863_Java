public class Person {
    private String name;
    private Book book;
    // Relationship: Person has a Heart
    private Heart heart = new Heart(44, HeartBeat.PITTERPATTER);

    // Relationship: Person has a Book
    public Person(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    // Relationship: Person interacts with Bookshelf
    public void putBookOnBookshelf(Bookshelf shelf) {
        shelf.addBookToBookshelf(book);
        book = null; // The person no longer has the book after placing it on the shelf
    }

    public void retrieveBookFromBookshelf(String title, Bookshelf shelf) {
        this.book = shelf.retrieveBookFromBookshelf(title);
    }

    public String whatBookDoIHave() {
        if (book == null) {
            return name + " has no book";
        } else {
            return name + " has the book: " + book.getTitle();
        }
    }

    public void makeHeartPump() {
        heart.oneMinute();
    }
}