public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // выносим логику проверки в другой класс PersonService
//    public boolean fullAge() {
//        return this.getAge() >= 21;  // проверяем и возвращаем True или False
//    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseAge(int increment) { //  метод increase может только увеличить возраст на указанный при его вызове ivanov.increaseAge(1);
        if (increment < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age + increment;
    }

    public String toString() { // если нужно выводить при обращении к классу на прямую через Main System.out.println(ivanov);
        return "Имя " +this.name+ " Возраст " + this.age;
    }
}

