public class Main {
    public static void main(String[] args) {

        // Задача 1
        byte age = 17;

        if (age >= 18){
            System.out.println("Тебе 18 или больше лет");
        } else {
            // Блок выполнится. Результат выражения в условии if был false
            System.out.println("Ты еще салага, подрасти ))");
        }


        // Задача 2
        byte realTemperature = 17;

        if (realTemperature < 5){
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            // Блок выполнится. Результат выражения в условии if был false
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        // Задача 3
        byte overSpeed = 17;

        if (overSpeed > 60){
            System.out.println("Скорость превышена");
        } else {
            // Блок выполнится. Результат выражения в условии if был false
            System.out.println("Превышения скорости нет");
        }

        // Задача 4
        byte realAge = 55;

        if (realAge <= 6 && realAge >= 2){
            System.out.println("Тебе нужно ходить в детский сад");
        }
        if (realAge <= 17 && realAge >= 7){
            System.out.println("Тебе нужно ходить в школу");
        }
        if (realAge <= 24 && realAge >= 18){
            System.out.println("Тебе нужно ходить в университет");
        }
        if (realAge > 24) {
            // Блок выполнится. Результат выражения в условии if был false
            System.out.println("Ты оборзел иди работать, трутень или начни учится в Skypro!");
        }

        // Задача 5
        byte child = 14;
        boolean adult = false;

        if (child < 5) {
            System.out.println("Тебе рано на аттракцион");
        }
        if (child < 14 && realAge >= 5 && !adult){
            System.out.println("Если взрослого рядом нет, то кататься нельзя");
        }
        if (child >= 14 && !adult){
            System.out.println("Ты можешь кататься без сопровождения взрослого");
        }


        // Задача 6
        byte trainCarriageAll = 102;
        byte trainCarriageSeating = 60;
        byte trainCarriageAvailableAll = 59;

        if (trainCarriageAvailableAll < trainCarriageAll){
            System.out.println("Есть место в вагоне");
        } else {
            System.out.println("Вагон уже полностью забит");
        }
        if (trainCarriageAvailableAll < trainCarriageSeating){
            System.out.println("Есть сидячее место в вагоне");
        }
        if (trainCarriageAvailableAll > trainCarriageSeating && trainCarriageAvailableAll < trainCarriageAll) {
            System.out.println("В вагоне остались только стоячие места");
        }

        // Задача 7
        int one;
        int two;
        int three;

        one = 1;
        two = 2;
        three = 3;

        int truee = 0;

        if (one > two) {
            System.out.println(truee = one);
        } else {
            System.out.println(truee = two);
        }
        if (truee > three) {
            System.out.println(truee = three);
        } else {
            System.out.println(truee = three);
        }
    }
}