public class Book {
    private int id;
    private String title;
    private String author;

    public Book(int id,String author,  String title) {
        this.author = author;
        this.id = id;
        this.title = title;
    }
    public String toString(){
        return id+" "+title+" "+author;
    }
    public int getId() {
        return id;
    }
}
