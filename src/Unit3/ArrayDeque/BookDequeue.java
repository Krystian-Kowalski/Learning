package Unit3.ArrayDeque;
import java.util.ArrayDeque;
import java.util.Deque;

class Book{
    String title;
    String author;
    int year;

    // constructor with arguments
    public Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // toString method used for printout the object
    public String toString(){
        return "Title: \"" + title + "\", author: " + author + ", (" + year + ")";
    }
}


public class BookDequeue {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 1979);
        Book book2 = new Book("Anna Karenina", "Lev Tolstoy", 1998);
        Book book3 = new Book("Ulysses", "James Joyce", 2010);
        Book book4 = new Book("War and Peace", "Lev Tolstoy", 2001);
        Book book5 = new Book("The Bomb maker", "Thomas Perry", 2018);

        Deque<Book> books = new ArrayDeque<Book>();
        books.offer(book1);
        books.offer(book2);
        books.offer(book3);
        books.offer(book4);
        books.offer(book5);

        System.out.println("Queue size is: " + books.size());

        Book temporaryOrder;
        temporaryOrder = books.poll();
        temporaryOrder = books.poll();
        temporaryOrder = books.poll();
        temporaryOrder = books.poll();
        temporaryOrder = books.poll();
        System.out.println("Queue is emptied. It's size: " + books.size());
        System.out.println("Last order taken from queue was:\n" + temporaryOrder);
    }
}
