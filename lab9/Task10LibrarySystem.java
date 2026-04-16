public class Task10LibrarySystem {
    static class Library {
        class Book {
            String title;

            Book(String title) {
                this.title = title;
            }

            void showTitle() {
                System.out.println("Book title: " + title);
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Library.Book book = library.new Book("Java Basics");
        book.showTitle();
    }
}