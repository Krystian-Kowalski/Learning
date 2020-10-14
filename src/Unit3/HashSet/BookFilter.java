package Unit3.HashSet;
import java.util.*;

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
//    Konieczne do działania HashSetu
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    public int hashCode() {
        return Objects.hash(title, author, year);
    }

    public String toString() {
        return title + " " + author + " " + year;
    }

    public int getYear() {
        return year;
    }

}

class BookDatabase {
//    atrybut klasy BookDatabase, Set obiektów Book o nazwie books
    private Set<Book> books;
// Konstruktor BookDatabase(), którego paramametrem jest Set obiektów Book o nazwie books
    public BookDatabase(Set<Book> books) {
        this.books = books;
    }

    //    medoda zwraca Set książek-obiektów
    public Set<Book> filterByYearGreaterThan(int year) {
//        dodaję Set obiektów Book o nazwie filteredBooks, do której będę dodawać books zwracane z ifa
        Set<Book> filteredBooks = new HashSet<Book>();
//        Dla każdego obiektu Book o nazwie (roboczej) theBook branego z Setu o nazwie books
        for (Book theBook : books) {
            if (theBook.getYear() >= year) {
                filteredBooks.add(theBook);
            }
        }
        return filteredBooks;
    }


}

public class BookFilter {
    public static void main(String[] args) {
// deklaruję obiekty znajdujące się w Secie
        Book book1 = new Book("1984", "George Orwell", 1979);
        Book book2 = new Book("Anna Karenina", "Lev Tolstoy", 1998);
        Book book3 = new Book("Ulysses", "James Joyce", 2010);
        Book book4 = new Book("War and Peace", "Lev Tolstoy", 2001);
        Book book5 = new Book("The Bomb maker", "Thomas Perry", 2018);

// deklaruję nowy Set obiektóe Book o nazwie
        Set<Book> yearSet = new HashSet<Book>();
        yearSet.add(book1);
        yearSet.add(book2);
        yearSet.add(book3);
        yearSet.add(book4);
        yearSet.add(book5);

        BookDatabase bookDatabase = new BookDatabase(yearSet);
// Deklaruję nową zmienną typu Set o nazwie (roboczej) bookSet i przypisuję jej wynik z metody filterByYearGreaterThan(o danym parametrze)
        Set<Book> bookSet = bookDatabase.filterByYearGreaterThan(2010);
        System.out.println(bookSet);

    }
}
