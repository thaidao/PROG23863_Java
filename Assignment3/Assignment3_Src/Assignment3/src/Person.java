public class Person {
    private String name;
    private Book book;
    private Heart heart = new Heart(44, HeartBeat.PITTERPATTER);

    public Person(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    public Person(String name) {
        this.name = name;
        //this.book = book;
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

    public void putBookOnBookshelf(Bookshelf shelf) {
        shelf.addBookToBookshelf(book);
    }

    public void retrieveBookFromBookshelf(String title, Bookshelf shelf) {
        this.book = shelf.retrieveBookFromBookshelf(title);
    }

    public String whatBookDoIHave() {
        return book.getTitle();
    }

    public void makeHeartPump() {
        heart.oneMinute();
    }
}