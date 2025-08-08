public class Main {
    public static void main(String[] args) {

        // Задача 1
        int mounth = 0;
        int total = 0;

        while ( total < 2_459_000) {
            mounth++;
            total += 15_000;
            System.out.println("Месяц " + mounth +", сумма накоплений равна " + total + " рублей");
        }

        // Задача 2
        int start0 = 0;

        while (start0 < 10) {
            start0++;
            System.out.print (" " +start0);
        }

        System.out.println();


        for (int start1 = 10; start1 > 0; start1--) {
            System.out.print (" " +start1);
        }

        // Задача 3
        var Y = 12_000_000;
        var mortality = 0.0008;
        var birthRate = 0.0017;

        for (int i = 1; i <= 10; i++) {
            var populationGrowthYaer = Y * (birthRate - mortality);
            Y += populationGrowthYaer;
            System.out.println("Год " + i +", численность населения составляет " + Y);
        }

        // Задача 4
        double start = 15_000;
        double proc = 0.07;
//        int mounth = 0;

        while (start < 12_000_000) {
            mounth++;
            start = start + (start * proc);
            System.out.println("Месяц " + mounth +", сумма накоплений равна" + start + " рублей");
        }

        // Задача 5
//        double start = 15_000;
//        double proc = 0.07;
        double mounth1 = 1;

        for (; start < 2_000_000; mounth1++) {
            start = start + (start * proc);

            if (mounth1 % 6 == 0) {
                System.out.println("Месяц " + mounth1 + ", сумма накоплений равна " + start + " рублей");
            }
        }

        // Задача 6
//        double start = 15_000;
//        double proc = 0.07;
        int months = 9 * 12;    // 9 лет в месяцах

        for (int month = 1; month <= months; month++) {
            start += start * proc;

            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + start + " рублей");
            }
        }

//        // Задача 7
        int friday = 3;
        int month = 31;

        for (int day = friday; day <= month; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
        }

        // Задача 8
        int realYear = 2025;
        int year200 = realYear - 200;
        int year100 = realYear + 100;
        int cometPeriod = 79;

        for (int year = 0; year <= year100; year += cometPeriod) {
            if (year >= year200 && year <= year100) {
                System.out.println(year);
            }
        }
    }
}

