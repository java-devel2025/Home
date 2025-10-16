import java.util.Objects;

public class EmployeeBook {
    private Employee[] employees = new Employee[10];

    // 1. Список всех сотрудников
    public void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee); // работает через toString()
            }
        }
    }

    // 2. Средняя зарплата
    public double getAverageSalary() {
        double sum = 0;
        int count = 0;
        for (Employee employee : employees) {
            if (employee == null) break;
            sum += employee.get_salary();
            count++;
        }
        return count == 0 ? 0 : sum / count;
    }

    // 3. Расчёт налогов
    public void printTaxes(String type) {
        for (Employee employee : employees) {
            if (employee != null) {
                double salary = employee.get_salary();
                double tax = 0;
                switch (type.toUpperCase()) {
                    case "PROPORTIONAL":
                        tax = salary * 0.13;
                        break;
                    case "PROGRESSIVE":
                        if (salary <= 150) tax = salary * 0.13;
                        else if (salary <= 350) tax = salary * 0.17;
                        else tax = salary * 0.21;
                        break;
                    default:
                        System.out.println("Неизвестный тип налогообложения");
                        return;
                }
                System.out.println(employee.getFio() + " налог: " + tax);
            }
        }
    }

    // 4. Индексация по отделу
    public void indexSalaryByDepartment(int dep, double percent) {
        for (Employee employee : employees) {
            if (employee == null) continue;
            if (employee.get_department() == dep) {
                double newSalary = employee.get_salary() * (1 + percent / 100);
                employee.setSalary(newSalary);
            } else {
                continue;
            }
        }
    }

    // 5. Первый сотрудник отдела с зарплатой > threshold
    public void printFirstByDeptAndSalary(int dep, double threshold) {
        for (int i = 0; i < employees.length; i++) {
            Employee e = employees[i];
            if (e != null && e.get_department() == dep && e.get_salary() > threshold) {
                System.out.println("Найден сотрудник на позиции " + i + ": ");
                e.printShortInfo();
                break;
            }
        }
    }

    // 6. Первые N сотрудников с з/п < wage
    public void printFirstEmployeesBelowWage(double wage, int employeeNumber) {
        int count = 0;
        int i = 0;
        while (i < employees.length && count < employeeNumber) {
            Employee e = employees[i];
            if (e != null && e.get_salary() < wage) {
                e.printShortInfo();
                count++;
            }
            i++;
        }
    }

    // 7. Проверка наличия сотрудника по equals (с точки зрения зарплаты)
    public boolean contains(Employee emp) {
        for (Employee e : employees) {
            if (e != null && e.equals(emp)) {
                return true;
            }
        }
        return false;
    }

    // 8. Добавление сотрудника
    public boolean addEmployee(Employee emp) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = emp;
                return true;
            }
        }
        return false;
    }

    // 9. Поиск по id
    public Employee getById(int id) {
        for (Employee e : employees) {
            if (e != null && e.getId() == id) {
                return e;
            }
        }
        return null;
    }
}
