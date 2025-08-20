import java.util.Objects;

public class Book {
    private String nameBook;
    private Author author;
    private int year;

    public Book(Author author, int year, String nameBook) {
        this.author = author;
        this.year = year;
        this.nameBook = nameBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNameBook() {
        return nameBook;
    }

    @Override
    public String toString() {
        return "Название: " + nameBook + ", Автор: " + author + ", Год: " + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return year == book.year &&
                Objects.equals(nameBook, book.nameBook) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author, year);
    }
}
