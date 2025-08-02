public class Main {
    public static void main(String[] args) {

        // Задача 1
        byte clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        // Задача 2
        int clientDeviceYear = 2014;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
          if (clientDeviceYear >= 2015) {
              System.out.println("Установите облегченную версию приложения для Android по ссылке");
          }
        }

        // Задача 3
        short year = 2021;

        if (year <= 1584) {
            System.out.println(year + " год не проверяется, так как високосные годы ввели после 1584 года.");
        } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        // Задача 4
        short deliveryDistance = 25;
        byte days = 1;

        if (deliveryDistance > 100) {
            System.out.println("Доставка не осуществляется на расстояние более 100 км.");
        } else {
            if (deliveryDistance <= 20) {
                System.out.println(" Потребуется дней: " + (days) + " срок доставки");
            }
            if (deliveryDistance > 20 && deliveryDistance <= 60) {
                System.out.println(" Потребуется дней: " + (days + 1) + " срок доставки");
            }
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                System.out.println(" Потребуется дней: " + (days + 2) + " срок доставки");
            }
        }

        // Задача 5
        byte monthNumber = 1;

        switch (monthNumber) {
            case 1:
                System.out.println("Месяц " + monthNumber + " январь");
                System.out.println(" это зима");
                break;
            case 2:
                System.out.println("Месяц " + monthNumber + " февраль");
                System.out.println(" это зима");
                break;
            case 3:
                System.out.println("Месяц " + monthNumber + " март");
                System.out.println(" это зима");
                break;
            case 4:
                System.out.println("Месяц " + monthNumber + " апрель");
                System.out.println(" это лето");
                break;
            case 5:
                System.out.println("Месяц " + monthNumber + " май");
                System.out.println(" это лето");
                break;
            case 6:
                System.out.println("Месяц " + monthNumber + " июнь");
                System.out.println(" это лето");
                break;
            case 7:
                System.out.println("Месяц " + monthNumber + " июль");
                System.out.println(" это осень");
                break;
            case 8:
                System.out.println("Месяц " + monthNumber + " август");
                System.out.println(" это осень");
                break;
            case 9:
                System.out.println("Месяц " + monthNumber + " сентябрь");
                System.out.println(" это осень");
                break;
            case 10:
                System.out.println("Месяц " + monthNumber + " октябрь");
                System.out.println(" это зима");
                break;
            case 11:
                System.out.println("Месяц " + monthNumber + " ноябрь");
                System.out.println(" это зима");
                break;
            case 12:
                System.out.println("Месяц " + monthNumber + " январь");
                System.out.println(" это зима");
                break;
            default:
                break;
        }
    }
}
