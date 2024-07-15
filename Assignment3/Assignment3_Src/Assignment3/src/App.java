public class App {
    public static void main(String[] args) {
        System.out.println("Program started!");

        // Example usage
        Book book1 = new Book("Java Programming", Genre.EDUCATIONAL);
        Book book2 = new Book("The Funny Story", Genre.HUMOUR);

        Bookshelf shelf = new Bookshelf();
        shelf.addBookToBookshelf(book1);
        shelf.addBookToBookshelf(book2);

        Person person = new Person("Alice", book1);
        person.putBookOnBookshelf(shelf);
        person.retrieveBookFromBookshelf("The Funny Story", shelf);
        
        System.out.println(person.whatBookDoIHave());

        System.out.println("Books on shelf:");
        shelf.displayBooks();

        person.makeHeartPump();
    }
}
