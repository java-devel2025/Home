import java.time.LocalDate;

public class Main {

        // Задача 1

    public static void checkYear(int year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    public static void checkPhone(int system, int year) {
        int currentYear = LocalDate.now().getYear();

        if (system == 1) {
            if (year < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
            else {
                System.out.println("Установите обычную версию приложения для iOS по ссылке");
            }
        }

        if (system == 0) {
            if (year < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
            else {
                System.out.println("Установите обычную версию приложения для Android по ссылке");
            }
        }
    }

    public static void deliverCard(int km) {
        int day = 1;
        if (km <= 20) {
            System.out.println("Потребуется дней: " + day);
        }
        if ( km > 20 && km <= 60) {
            day++;
            System.out.println("Потребуется дней: " + day);
        }
        if (km > 60 && km <= 100) {
            day += 2;
            System.out.println("Потребуется дней: " + day);
        }
        if (km > 100) {
            System.out.println("Доставки нет!");
        }
    }

    public static void main(String[] args) {
        checkYear(2021);
        checkYear(2024);
        checkPhone(1, 2015);
        checkPhone(0, 2016);
        deliverCard(95);
    }

        // Задача 2


        // Задача 3


        // Задача 7

        // Задача 8

}

