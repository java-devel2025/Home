import java.util.Objects;


public class Employee {

    // значения для каждого объекта
    private final int id;
    private final String name;
    private int department;
    private double salary;

    private static int counter = 1;  // static привязывает значение к классу

    public Employee(String name, int department, int salary) {
        this.id = counter++;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String get_name() {
        return this.name;
    }

    public int get_department() {
        return this.department;
    }

    public double get_salary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int set_department(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Отдел должен быть от 1 до 5");
        }
        this.department = department;
        return this.department;
    }

    public double set_salary(double salary) {
        this.salary = salary;
        return this.salary;
    }

    @Override
    public String toString() { // если нужно выводить при обращении к классу на прямую через Main System.out.println(ivanov);
        return "ID: " + this.id + " Отдел: " + this.department + " Имя: " + this.name + " ЗП - " + this.salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee data = (Employee) o;
        return name == data.name &&
                Objects.equals(salary, data.salary) &&
                Objects.equals(department, data.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, department, salary);
    }
}
