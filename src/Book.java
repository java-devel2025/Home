public class Book {
    private String nameBook;
    private Author author;
    private int year;

    public Book (Author author, int year, String nameBook) {
        this.author = author;
        this.year = year;
        this.nameBook = nameBook;
    }

    public Author getAuthor () {
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
