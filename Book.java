public class Book {

    private String name , author , kind;
    private int code;
    private boolean is_available;


    //constructor
    public Book(String name , String author , String kind , int code , boolean is_available) {
        this.name = name;
        this.author = author;
        this.kind = kind;
        this.code = code;
        this.is_available = is_available;
    }


    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public boolean isIs_available() {
        return is_available;
    }

    public void setIs_available(boolean is_available) {
        this.is_available = is_available;
    }
}
