import java.util.ArrayList;

public class LibrarySystem {
    ArrayList<Book> books = new ArrayList<>();

    public LibrarySystem(){
        books.add(new Book(1,"Sarah Jio","The Last Camelia"));
        books.add(new Book(2,"Colleen Hoover","It starts with us"));
        books.add(new Book(3,"Ronald Dahl","Matilda"));
    }



    public void orderBook(int id) throws BookNotFoundException{
        for (Book book : books){
            if (book.getId()==id){
                System.out.println("Order accepted "+book);
                return;
            }

        }
        throw new BookNotFoundException("Book not found ID= "+id);

    }
}
