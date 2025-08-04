public class Main {
    public static void main(String[] args) {

        // Задача 1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Задача 2
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        // Задача 3
        for (int i = 0; i <= 17 && i % 2 == 0 ; i = i + 2) {
            System.out.println(i);
        }

        // Задача 4
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        // Задача 5
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i);
        }

        // Задача 6
        int i = 7;
        int end = i * 14;

        for (; i <= end; i = i + 7) {
            System.out.println(i);
        }

        // Задача 7
        int ii = 2;
        int endd = 512;

        for (; ii <= endd + 1; ii = ii * 2) {
            System.out.println(ii);
        }

        // Задача 8
        int month = 29000;
        int total = 0;

        for (int iii = 0; iii < 12; iii++) {
            total = total + month;
            System.out.println(total);
        }

        // Задача 9
        int monthh = 29000;
        int bonuse = 0;

        for (int iiiii = 0; iiiii <= 12; iiiii++) {
            bonuse = bonuse + monthh/100;
            monthh = monthh + bonuse;
            System.out.println("Месяц " + iiiii + ", сумма накоплений равна " + bonuse + " рублей");
        }

        // Задача 10
        int p = 2;
        for (int u = 1; u <= 10; u = u + 1) {
            p = u * 2;
            System.out.println("(2*"+u+"="+p+")");
        }
    }
}
