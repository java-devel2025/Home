import java.time.LocalDate;

public class Main {
    // Задача 1


    public static void main(String[] args) {
        Book book = new Book("Sarah. L", 1933, "Blabla");
        Book book1 = new Book("John. L", 2025, "Blabla2");

        book.setYear(2024);

        Author author = new Author("Ivanov", "Ivan");
        Author author1 = new Author("Petrov", "Ivan");

        System.out.println("Автор - " + book.getAuthor() + " Год издания: " + book.getYear() + " Название книги - " + book.getNameBook());
        System.out.println("Автор - " + book1.getAuthor() + " Год издания: " + book1.getYear() + " Название книги - " + book1.getNameBook());
    }


        // Задача 2

    // Задача 3


        // Задача 7

        // Задача 8

}

