import java.util.ArrayList;
import java.util.Collection;

public class LibraryReader implements  Reader {

    private int ticketNumber = 0;
    private Collection<Book> books;
    private Collection<Book> booksRead;

//    public LibraryReader() {
//        books = new ArrayList<>();
//        booksRead = new ArrayList<>();
//    }

    public LibraryReader(int ticketNumber, Collection<Book> booksRead){
        this.ticketNumber = ticketNumber;
        this.booksRead = booksRead;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Collection<Book> getBooks() {
        return books;
    }

    public void setBooks(Collection<Book> books) {
        this.books = books;
    }

    public Collection<Book> getBooksRead() {
        return booksRead;
    }

    public void setBooksRead(Collection<Book> booksRead) {
        this.booksRead = booksRead;
    }

    @Override
    public void readBook(Book book) {
        booksRead.add(book);
    }
}
