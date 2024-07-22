package A3allothersclasses;

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
                System.out.print(book.getTitle() +",");
            }
        }
    }

    //return the number of array elements in the book array that are not null
    public int howManyBooks() {
        int cnt = 0;
        for (Book book : books) {
            if (book != null) {
                cnt++;
            }
        }
        return cnt;
    }

    public void showHowManyBooks()
    {
        int numBook = howManyBooks();
        if(numBook > 0){
            System.out.println("There are "+ numBook+ " books on the bookshelf");
        }else{
            System.out.println("The bookshelf is empty"); 
        }
    }
}