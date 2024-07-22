package A3startclass;
import A3allothersclasses.Book;
import A3allothersclasses.Genre;
import A3allothersclasses.Bookshelf;
import A3allothersclasses.Person;

public class Start {
    public static void main(String[] args) {
        System.out.println("Program started!");

        //Instantiating 3 books
        Book book1 = new Book("Harry Potter", Genre.ADVENTURE);
        Book book2 = new Book("Funniest Joke", Genre.HUMOUR);
        Book book3 = new Book("Learning Java", Genre.EDUCATIONAL);

        //Instantialting bookshelf
        Bookshelf shelf = new Bookshelf();
        // shelf.addBookToBookshelf(book1);
        // shelf.addBookToBookshelf(book2);
        // shelf.addBookToBookshelf(book3);

        System.out.println("Instantiating 3 person objects and giving each one a Book object");
        Person person1 = new Person("Rich", book1);
        Person person2 = new Person("Fred", book2);
        Person person3 = new Person("Barney", book3);

        System.out.println("make any one of the person objects pump their heart for 1 minute");
        person1.makeHeartPump();

        System.out.print("\nDisplaying Bookshelf:");
        shelf.showHowManyBooks();

        //Rich
        System.out.println(person1.whatBookDoIHave());
        person1.putBookOnBookshelf(shelf);
        System.out.println(person1.getName() + " is putting the book on the bookshelf");
        System.out.println(person1.whatBookDoIHave());
        System.out.print("Displaying Bookshelf: ");
        shelf.displayBooks();
        System.out.println();
        //Fred
        System.out.println(person2.whatBookDoIHave());
        //Barley
        System.out.println(person3.whatBookDoIHave());

        //Fred and Barley put their book on the shelf
        System.out.println(person2.getName() + " and " + person3.getName() + " is putting the book on the bookshelf");
        person2.putBookOnBookshelf(shelf);
        person3.putBookOnBookshelf(shelf);
        
        //Show many books on the shelf
        shelf.showHowManyBooks();
        System.out.println(person1.whatBookDoIHave());
        System.out.println(person2.whatBookDoIHave());
        System.out.println(person3.whatBookDoIHave());

        //Display shelf
        System.out.print("Displaying Bookshelf: ");
        shelf.displayBooks();
        System.out.println();

        //Fred is taking the Harry Potter
        System.out.println(person2.getName() + " is taking the " + book1.getTitle() + " book from the shelf");
        person2.retrieveBookFromBookshelf(book1.getTitle(), shelf);
        System.out.println(person2.whatBookDoIHave());

        //Display shelf
        System.out.print("Displaying Bookshelf: ");
        shelf.displayBooks();
    }
}
