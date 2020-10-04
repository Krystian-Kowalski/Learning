package Unit2.Lists;

import java.util.*;

class App {

    static class BookList {
// List of object Book
        public  List<Book> getList() {
            List<Book> theList = new LinkedList<>();

            theList.add(new Book(2007, "Zodiak"));
            theList.add(new Book(1940, "Pinocchio"));
            theList.add(new Book(2009, "The Boat That Rocked"));
            theList.add(new Book(2015, "Creed"));
            theList.add(new Book(2000, "The Matrix"));
            return theList;
        }
    }
    static class Book {
        private String title;
        private int year;

        public Book(int year, String title) {
            this.year = year;
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return  title + " " + year;
        }
    }

    static class CenturySorter {
        // which part does what?
        public List<Book> sort(List<Book> books) {
            // diamond operator rakes same parameter as the list
            List<Book> sortedBooks = new LinkedList<>();

            for (Book book : books) {
                if (book.getYear()>=2000) {
                    // what do I add to what. I add book to sortedBooks
                    sortedBooks.add(book);
                }
            }
            return sortedBooks;
        }
    }

    static class GradesGenerator {

        private Random random = new Random();

//      I don't fully get why there is the parameter int count
        public List<Integer> generateITGrades(int count) {
            List<Integer> grades = new ArrayList<>();

            for(int i = 0; i < count; i++) {
                grades.add(random.nextInt(6) + 1);
            }
            return grades;
        }
    }

    static class AvgCalculator {

        public double calculate(List<Integer> grades) {
            List<Integer> gradesWithoutExtrems = excludeExtremsIfApplicable(grades);

            double sum = 0.0;

            for(Integer grade : gradesWithoutExtrems) {
                sum += grade;
            }
            return sum / gradesWithoutExtrems.size();
        }

        private List<Integer> excludeExtremsIfApplicable(List<Integer> list) {
            List<Integer> copy = new ArrayList<>(list);
            if(copy.size() < 3) {
                return list;
            }
//this max, min is actually awesome!
            Integer max = Collections.max(copy);
            Integer min = Collections.min(copy);

            copy.remove(max);
            copy.remove(min);

            return copy;
        }
    }

    public static void main(String[] args) {
        GradesGenerator gradesGenerator = new GradesGenerator();
        List<Integer> grades = gradesGenerator.generateITGrades(50);
        AvgCalculator avgCalculator = new AvgCalculator();

//
        BookList bookList = new BookList();
        List<Book> books = bookList.getList();
        CenturySorter sorter = new CenturySorter();
        List<Book> sortedBooks = sorter.sort(books);



        System.out.println("Student's grades are: " + grades);
        System.out.println("The average grade is: " + avgCalculator.calculate(grades));

        System.out.println(sortedBooks);
    }
}