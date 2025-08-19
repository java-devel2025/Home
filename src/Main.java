public class Main {
    // Задача 1

    public static void main(String[] args) {
        Author author = new Author("Ivanov", "Ivan");
        Book book = new Book(author,1933, "Blabla");  // добавляем Author и Author1 как готовые значения

        System.out.println("Вывод функции Author.toString() " + author);
        System.out.println("Вывод функции Book.toString() " + book);


        Author g = new Author("Ivanov", "Ivan");
        System.out.println("Сравнение имени из класса Author " + author.equals(g));

        // я не понимаю как сравнить данные из класса Book
//        Book book1 = new Book(author,1933, "Blabla");
//        System.out.println("Сравнение имени из класса Book " + book.equals(book1));
    }


        // Задача 2

    // Задача 3


        // Задача 7

        // Задача 8

}

