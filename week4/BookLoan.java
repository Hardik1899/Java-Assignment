public class BookLoan {
    public void main(String[] args){

    }
    class Book {
        String title;
         String author;
         int bookCode;
         boolean loaned_status;

        public Book(String title, String author, int bookCode) {
         System.out.println("Welcome to Online BookStore!!");

          this.title = title;
          this.author = author;
          this.bookCode = bookCode;
          this.loaned_status = false;
        }

        public boolean borrowBook() {
            if (loaned_status) {
                return false;
            }else {
                loaned_status = true;
                return true;
            }
        }

        public boolean returnBook() {
            if (!loaned_status) {
                return false;
            }else {
                loaned_status = false;
                return true;
            }
        }

        public boolean isAvailable() {
            if(loaned_status){
                return false;
            }else{
                return true;
            }
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public int getBookCode() {
            return bookCode;
        }

        @Override
        public String toString() {
            return "Book{" + "title =" + title + " " + ", author =" + author + " " + ", bookCode =" + bookCode + " " + ", available =" + isAvailable() + '}';
        }
    }

    public class bookLoan{
        public void main(String[] args) {
            Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 101);
            Book book2 = new Book("1984", "George Orwell", 102);

             System.out.println(book1);
            System.out.println(book2);

            System.out.println("borrow book1: " + book1.borrowBook());
            System.out.println("Book1 avalable: " + book1.isAvailable());

            System.out.println("Borrow book1 again: " + book1.borrowBook());

            System.out.println("Return book1: " + book1.returnBook());
             System.out.println("Book1 available: " + book1.isAvailable());

            System.out.println("Return book1 again: " + book1.returnBook());

            System.out.println("Borrow book2: " + book2.borrowBook());
             System.out.println("Book1 available: " + book1.isAvailable());
            System.out.println("Book2 available: " + book2.isAvailable());

            System.out.println("Final book states:");
            System.out.println(book1);
            System.out.println(book2);
        }
    }
}
