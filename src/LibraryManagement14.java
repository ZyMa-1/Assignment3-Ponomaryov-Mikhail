import java.util.ArrayList;

public class LibraryManagement14 {
    public class Book {
        private String title;
        private String author;
        private int publicationYear;

        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.publicationYear = year;
        }

        public String getBookInfo() {
            return title + " by " + author + " (" + publicationYear + ")";
        }
    }

    public class Library {
        private ArrayList<Book> books = new ArrayList<>();

        public void addBook(Book book) {
            books.add(book);
        }

        public void displayBooks() {
            for (Book book : books) {
                System.out.println(book.getBookInfo());
            }
        }
    }

    public static void main(String[] args) {
        LibraryManagement14 librarySystem = new LibraryManagement14();
        Library library = librarySystem.new Library();

        Book book1 = librarySystem.new Book("Java Programming", "John Doe", 2022);
        Book book2 = librarySystem.new Book("Introduction to Algorithms", "Jane Smith", 2019);

        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();
    }
}
