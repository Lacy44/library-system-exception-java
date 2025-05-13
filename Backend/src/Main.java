import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       LibrarySystem librarySystem = new LibrarySystem();

       try {
           librarySystem.orderBook(6);
           librarySystem.orderBook(1);
       }
       catch (BookNotFoundException e){
           System.out.println(e.getMessage());
       }


    }
}