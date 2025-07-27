public class Main {
    public static void main(String[] args) {

        // Задача 1
        int intt;
        byte bytee;
        short shortt;
        long longg;
        float floatt;
        double doublee;


        // Задача 2
        intt = 67;
        bytee = 67;
        shortt = 27897;
        longg = 987678965549L;
        floatt = 27.12f;
        doublee = 2.786;


        // Задача 3
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        short total = 480;
        System.out.println("На каждого ученика рассчитано " + total / (class1 + class2 + class3) + " листов бумаги");


        // Задача 4
        byte crate = 8;
        byte minutes20 = 20;
        byte day = 1;
        byte day3 = 3;
        byte month = 1;
        System.out.println("За " + minutes20 + " минут машина произвела " + minutes20 * crate + " штук бутылок");
        System.out.println("За " + day + " день машина произвела " + day * 1440 * crate + " штук бутылок");
        System.out.println("За " + day3 + " дня машина произвела " + day3 * 1440  * crate + " штук бутылок");
        System.out.println("За " + month + " месяц машина произвела " + day * 1440 * 30 * crate + " штук бутылок");


        // Задача 5
        byte needWhite = 2;
        byte needBrown = 4;
        byte all = 120;

        System.out.println("В школе, где " + all / (needWhite + needBrown) + " классов, " +
                "нужно " + needWhite * (all / (needWhite + needBrown)) + " банок белой краски и "
                + needBrown * (all / (needWhite + needBrown)) +  " банок коричневой краски");


        // Задача 6

        // переменные количество
        byte pieceBanan;
        short pieceMilk;
        byte pieceIceCream;
        byte pieceAgs;

        // переменные вес
        byte weightBanan;
        float weightMilk;
        byte weightIceCream;
        byte weightEgg;
        short kg;

        // условие
        pieceBanan = 5;
        pieceMilk = 200;
        pieceIceCream = 2;
        pieceAgs = 4;

        // вес каждой части - постоянная
        weightBanan = 80;
        weightMilk = 1.05f;
        weightIceCream = 100;
        weightEgg = 70;
        kg = 1000;

        var totalBanan = pieceBanan * weightBanan;
        var totalMilk = pieceMilk * weightMilk;
        var totalIceCream = pieceIceCream * weightIceCream;
        var totalAgs = pieceAgs * weightEgg;
        var totalAllG = totalBanan + totalMilk + totalIceCream + totalAgs;
        var totalAllKg = totalAllG / kg;

        System.out.println("Вес завтрака составит " + totalAllG + " грамм, или " + totalAllKg + " килограмма");


        // Задача 7
        byte wait = 7;
        float drop250 = 0.25f;
        float drop500 = 0.5f;

        System.out.println("Если терять по 250 г. в день то потребуется " + wait / drop250 + " дней, а если терять по 500 г., " +
                "то потребуется " + wait / drop500 + " дней.");


        // Задача 8
        int masha = 67760;
        int denis = 83690;
        int kristi = 76230;
        float bonus = 0.1f;

        System.out.println("Маша теперь получает " + (masha + (masha * bonus)) +
                " рублей. Годовой доход вырос на " + masha * bonus + " рублей");

        System.out.println("Денис теперь получает " + (denis + (denis * bonus)) +
                " рублей. Годовой доход вырос на " + denis * bonus + " рублей");

        System.out.println("Кристина теперь получает " + (kristi + (kristi * bonus)) +
                " рублей. Годовой доход вырос на " + kristi * bonus + " рублей");
    }
}