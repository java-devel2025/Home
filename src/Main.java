public class Main {
    public static void main(String[] args) {

        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 2
        dog = dog + 4;
        System.out.println(dog);

        cat = cat + 4;
        System.out.println(cat);

        paper = paper + 4;
        System.out.println(paper);

        // Задача 3
        dog = dog - 3.5;
        System.out.println(dog);

        cat = cat - 1.6;
        System.out.println(cat);

        paper = paper - 7639;
        System.out.println(paper);

        // Задача 4
        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);

        // Задача 5
        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);

        // Задача 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer1 + boxer2);
        System.out.println(boxer2 - boxer1);

        // Задача 7
        System.out.println(boxer2 % boxer1);

        // Задача 8
        var allHour = 640;
        var hour = 8;
        var peoples = allHour / hour;
        var newPeoples = 94;
        System.out.println("Всего работников в компании — " + peoples + " человек");
        System.out.println("Если в компании работает " + peoples + " человек, то всего " + allHour / newPeoples +
                " часов работы может быть поделено между сотрудниками");
    }
}