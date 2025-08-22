public class Main {
    private static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иванов Иван Иванович", 1, 50_000);
        employees[1] = new Employee("Петров Петр Петрович", 2, 60_000);
        employees[2] = new Employee("Сидорова Анна Сергеевна", 3, 70_000);
        employees[3] = new Employee("Петрова Анна Сергеевна", 4, 75_000);
        employees[4] = new Employee("Иванова Анна Сергеевна", 4, 72_000);
        employees[5] = new Employee("Пупкин Иван Иванович", 1, 55_000);
        employees[6] = new Employee("Главнюк Петр Петрович", 2, 80_000);
        employees[7] = new Employee("Куркова Анна Сергеевна", 3, 90_000);
        employees[8] = new Employee("Сидорова Нина Сергеевна", 3, 70_000);
        employees[9] = new Employee("Захарчук Иван Иванович", 1, 65_000);


        System.out.println("Список всех сотрудников:");
        printAllEmployees();

        System.out.println("\nСумма затрат на зарплату: " + getSalarySum());

        System.out.println("\nСотрудник с минимальной зарплатой:");
        System.out.println(getEmployeeWithMinSalary());

        System.out.println("\nСотрудник с максимальной зарплатой:");
        System.out.println(getEmployeeWithMaxSalary());

        System.out.println("\nСредняя зарплата: " + getAverageSalary());

        System.out.println("\nФИО всех сотрудников:");
        printAllNames();

        // Для второй сложности

        // на сколько индексируем ЗП в %
        indexAll(10);

        System.out.println("\nИндексация ЗП:");
        printAllEmployees();

        System.out.println(findMinSalaryByDepartment(1));
        System.out.println(findMaxSalaryByDepartment(1));
        System.out.println("Сумма по отделу 1 = " + sumSalaryByDepartment(1));
        System.out.println("Средняя по отделу 1 = " + avgSalaryByDepartment(1));

        indexByDepartment(1, 5); // индексировать на 5% зарплаты отдела 1

        printEmployeesByDepartment(1);
        printEmployeesWithSalaryLessThan(55000);
        printEmployeesWithSalaryMoreOrEqual(60000);

    }

    // a) Получить список всех сотрудников
    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    // b) Посчитать сумму затрат на ЗП
    public static int getSalarySum() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.get_salary();
            }
        }
        return sum;
    }

    // c) Найти сотрудника с минимальной ЗП
    public static Employee getEmployeeWithMinSalary() {
        Employee min = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (min == null || employee.get_salary() < min.get_salary()) {
                    min = employee;
                }
            }
        }
        return min;
    }

    // d) Найти сотрудника с максимальной ЗП
    public static Employee getEmployeeWithMaxSalary() {
        Employee max = null;
        for (Employee employee : employees) {
            if (employee != null) {
                if (max == null || employee.get_salary() > max.get_salary()) {
                    max = employee;
                }
            }
        }
        return max;
    }

    // e) Подсчитать среднее значение зарплат
    public static double getAverageSalary() {
        int sum = getSalarySum();
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return count == 0 ? 0 : (double) sum / count;
    }

    // f) Распечатать ФИО всех сотрудников
    public static void printAllNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.get_name());
            }
        }
    }



        // Задача 2

    // Проиндексировать зарплату (вызвать изменение зп у всех сотрудников на величину аргумента в %)
    public static void indexAll(double percent) {
        for (Employee e : employees) {
            if (e != null) {
                e.setSalary(e.get_salary() * (1 + percent / 100.0));
            }
        }
    }

    public static Employee findMinSalaryByDepartment(int dept) {
        Employee min = null;
        for (Employee e : employees) {
            if (e != null && e.get_department() == dept) {
                if (min == null || e.get_salary() < min.get_salary()) {
                    min = e;
                }
            }
        }
        return min;
    }

    public static Employee findMaxSalaryByDepartment(int dept) {
        Employee max = null;
        for (Employee e : employees) {
            if (e != null && e.get_department() == dept) {
                if (max == null || e.get_salary() > max.get_salary()) {
                    max = e;
                }
            }
        }
        return max;
    }

    public static double sumSalaryByDepartment(int dept) {
        double sum = 0;
        for (Employee e : employees) {
            if (e != null && e.get_department() == dept) {
                sum += e.get_salary();
            }
        }
        return sum;
    }

    public static double avgSalaryByDepartment(int dept) {
        double sum = 0;
        int count = 0;
        for (Employee e : employees) {
            if (e != null && e.get_department() == dept) {
                sum += e.get_salary();
                count++;
            }
        }
        return count == 0 ? 0 : sum / count;
    }

    public static void indexByDepartment(int dept, double percent) {
        for (Employee e : employees) {
            if (e != null && e.get_department() == dept) {
                e.setSalary(e.get_salary() * (1 + percent / 100.0));
            }
        }
    }

    public static void printEmployeesByDepartment(int dept) {
        for (Employee e : employees) {
            if (e != null && e.get_department() == dept) {
                // выводим все данные, кроме отдела
                System.out.println("ФИО=" + e.get_name() + ", зарплата=" + e.get_salary());
            }
        }
    }

    // ===== 3. По зарплатам =====
    public static void printEmployeesWithSalaryLessThan(double limit) {
        System.out.println("Сотрудники с зарплатой < " + limit + ":");
        for (Employee e : employees) {
            if (e != null && e.get_salary() < limit) {
                System.out.println("ФИО=" + e.get_name() + ", зарплата=" + e.get_salary());
            }
        }
    }

    public static void printEmployeesWithSalaryMoreOrEqual(double limit) {
        System.out.println("Сотрудники с зарплатой >= " + limit + ":");
        for (Employee e : employees) {
            if (e != null && e.get_salary() >= limit) {
                System.out.println("ФИО=" + e.get_name() + ", зарплата=" + e.get_salary());
            }
        }
    }


    // Задача 3




}
        // Задача 7

        // Задача 8


