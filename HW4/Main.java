package HW4;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ann", "CEO", 6666666, 1000000, 20);
        System.out.println("Вывести при помощи методов из пункта 3 ФИО и должность.");
        employee1.nameis();
        employee1.positionis();
        System.out.println();

        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Ann", "CEO", 6666666, 9000000, 20);
        empArray[1] = new Employee("Kate", "SMM", 3333333, 8000000, 41);
        empArray[2] = new Employee("Heily", "accountant", 2222222, 7000000, 45);
        empArray[3] = new Employee("Ivan", "somebody", 1111111, 6000000, 30);
        empArray[4] = new Employee("Pavel", "somebody", 8888888, 5000000, 36);

        System.out.println("Сотрудники старше 40:");
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].age >= 40) {
                empArray[i].nameis();
                empArray[i].ageis();
                System.out.println();
            }
        }
        System.out.println("Сотрудники старше 35 до повышения:");
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].age >= 35) {
                empArray[i].nameis();
                empArray[i].ageis();
                empArray[i].salaryis();
                System.out.println();
            }
        }
        increaseSalary(empArray);
        System.out.println("Сотрудники старше 35 после повышения:");
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].age >= 35) {
                empArray[i].nameis();
                empArray[i].ageis();
                empArray[i].salaryis();
                System.out.println();
            }
        }

    }

    public static void increaseSalary(Employee[] empArray) {
        for (int i = 0; i < empArray.length; i++) {
            if (empArray[i].age >= 35) empArray[i].salary += 10000;
        }
    }
}

