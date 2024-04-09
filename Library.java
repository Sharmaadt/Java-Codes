public class Library {
    public static void main (String[] args){
        LibraryClass l = new LibraryClass();
        l.addBook("Ram","Amish",2022);
        l.addBook("Sita","Amish",2022);
        l.addBook("Ravan","Amish",2023);
        l.addBook("Lanka","Amish",2023);
        l.printBooks();
    }
}
class Book{
    String title;
    String  Writer;
    int publishYear;
    Book(String title,String Writer,int publishyear){
      this.title=title;
      this.Writer=Writer;
      this.publishYear=publishyear;
    }
    public String toString(){
        return
        "\nBook Name: "+title+"\nWriter name: "+Writer+"\npublish year: "+publishYear;
    }
}
class LibraryClass {
    Book[] books;
    int noOfBooks;
    LibraryClass(){
        books = new Book[10];
        noOfBooks=0;
    }
    void addBook(String title,String Writer, int publishYear){
        books[noOfBooks]=new Book(title,Writer,publishYear);
        noOfBooks++;
    }
    void printBooks(){
        for(int i=0;i<noOfBooks;i++){
            System.out.println(books[i]);
        }
    }
}

