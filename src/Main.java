import java.time.LocalDate;

public class Main {
    // Задача 1


    public static void main(String[] args) {
        Author author = new Author("Ivanov", "Ivan");
        Author author1 = new Author("Petrov", "Ivan");

        Book book = new Book(author,1933, "Blabla");
        Book book1 = new Book(author1,2025, "Blabla2");

        book.setYear(2024);

        System.out.println("Автор - " + author.getFullName() + " Год издания: " + book.getYear() + " Название книги - " + book.getNameBook());
        System.out.println("Автор - " + author1.getFullName() + " Год издания: " + book1.getYear() + " Название книги - " + book1.getNameBook());
    }


        // Задача 2

    // Задача 3


        // Задача 7

        // Задача 8

}

