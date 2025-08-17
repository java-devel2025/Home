public class Book {
    private String nameBook;
    private String author;
    private int year;

    public Book (String author, int year, String nameBook) {
        this.author = author;
        this.year = year;
        this.nameBook = nameBook;
    }

    public String getAuthor () {
        return author;
    }

    public int getYear () {
        return year;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public String getNameBook () {
        return nameBook;
    }
}
