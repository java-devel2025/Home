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

    public String toString() {
        Author author = new Author("Ivanov", "Ivan");
        String a = " Автор: " + author.toString() + " Год: " + this.year + " Название: " + this.nameBook;
        return a;
//        return "Название: " + nameBook + " Автор: " + author + " Год издания: " + year;
    }

    // сравнение контакта по имени
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return nameBook.equals(c2.getFullName());
    }

    // Если объекты равны, хеш-коды обязательно равные.
    // Если объекты не равны, хеш-коды не обязательно должны быть разные.
    // Если хеш-коды разные, объекты точно не будут равны.
    // hashCode выполняет первую и наименее точную проверку на равенство объектов.
    public int hashCode() {
        return java.util.Objects.hash(nameBook);
    }
}
