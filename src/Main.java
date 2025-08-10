import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        int[] weekDamage = {5000, 4500, 7000, 2000, 1000};
        int sum = 0;
        for (int i : weekDamage) {
            sum += i;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        // Задача
        int min = 0;
        int max = 0;

        for (int i = 0; i < weekDamage.length - 1; i++) {
            if (weekDamage[i + 1] < weekDamage[i]) {
                min = weekDamage[i];
            }
            if (weekDamage[i + 1] > weekDamage[i]) {
                max = weekDamage[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей. Максимальная сумма трат " +
                " за неделю составила " + max + " рублей");

        int middleDamage = 0;

        for (int i = 0; i < weekDamage.length; i++) {
            sum += weekDamage[i];
            middleDamage = sum / weekDamage.length;
        }
        System.out.println("Средняя сумма трат за месяц составила " + middleDamage + " рублей");


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = 0; i < reverseFullName.length / 2; i++) {
            char temp = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = temp;
        }
        System.out.print(reverseFullName);

        // Задача 3

        // Задача 4

        // Задача 5

        // Задача 6

        // Задача 7

        // Задача 8
    }
}

