import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.printf("Ф. И. О. сотрудника — " + fullName);

        System.out.println("");
        // Задача 2
        System.out.print("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        System.out.println("");

        // Задача 3
        String fullName1 = "Иванов Семён Семёнович";
        String fullName2 = fullName1.replace("ё", "е");

        System.out.print("Данные Ф. И. О. сотрудника — " + fullName2);

        // Задача 7

        // Задача 8
    }
}

