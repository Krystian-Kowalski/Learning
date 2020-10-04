//package Unit3.CollectionMeasuring;
//
//import java.util.*;
//
//class Book {
//    private String title;
//    private String author;
//
//    public Book(String title, String author){
//        this.title = title;
//        this.author = author;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return Objects.equals(title, book.title) &&
//                Objects.equals(author, book.author);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(title, author);
//    }
//
//    // toString method used for printout the object
//    public String toString(){
//        return "Title: \"" + title + "\", author: " + author;
//    }
//
//
//}
//
//class CollectionMeasurement {
//
//    public static void main(String[] args) {
//
//        List<Book> measuredList = new LinkedList<>();
//        for(int i= 0; i < 300000; i++) {
//            Book book = new Book("s " +i, "d" + i);
//            measuredList.add(book);
//        }
//
//        long beginForList = System.nanoTime();
//        measuredList.add((Book) Book);
//        long endForList = System.nanoTime();
//
//        System.out.println("Adding element at the end of the collection has taken: " + (endForList - beginForList) + "ns");
//
//        beginForList = System.nanoTime();
//        measuredList.add(0,(Book) Book);
//        endForList = System.nanoTime();
//
//        System.out.println("Adding element at the beginning of the collection has taken: " + (endForList - beginForList) + "ns");
//
//        Map<Book, Book> measuredMap = new HashMap();
//        for(int i= 0; i < 300000; i++) {
//            measuredMap.put((Book) Book, (Book) Book);
//        }
//
//        long beginForMap = System.nanoTime();
//        measuredMap.put((Book) Book, (Book) Book);
//        long endForMap = System.nanoTime();
//
//        System.out.println("Adding element at the end of the collection has taken: " + (endForMap - beginForMap) + "ns");
//    }
//
//
//}
