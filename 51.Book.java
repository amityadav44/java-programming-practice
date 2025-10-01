import java.util.Locale;

class Book {
    static int totalNoOfBooks;
    String title;
    String author;
    String isbn;
     boolean isBorrowed;
       static {
        totalNoOfBooks =0;
    }
    {
        totalNoOfBooks++;
    }
     Book(String isbn,String title, String author){
    this.isbn =isbn;
    this.title=title;
    this.author=author;
   }
    Book(String isbn){
           this(isbn,"Unknow","Unkonow");
    }
    static int getTotalNoOfBooks(){
           return totalNoOfBooks;
    }
    void borrowBook()
    {
        if (isBorrowed){
            System.out.println("book is borrowed book");

        }
        else {
            this.isBorrowed=true;
            System.out.println("Enjoy the Human valu book");
        }
    }
  void returnBook()
  {
    if (isBorrowed){
        this.isBorrowed=false;
        System.out.println("hope you enjoy ,please leave a review");
    }
    else {
        System.out.println("This book is already in laibery");
    }
  }

    public static void main(String[] args) {
        Book designOfThings= new Book("1","Design","Author");
        Book  mybook= new Book("2");
        System.out.println(Book.getTotalNoOfBooks());
        designOfThings.borrowBook();
        mybook.borrowBook();
        designOfThings.borrowBook();;
        designOfThings.returnBook();
        designOfThings.returnBook();

    }
}
