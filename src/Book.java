public class Book {
    private String author;
    private int year;

    public Book (String author, int year) {
        this.author = author;
        this.year = year;
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

}
