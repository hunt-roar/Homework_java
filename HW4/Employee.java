package HW4;

public class Employee {
    String name;
    String position;
    int phone;
    int salary;
    int age;

    Employee(String name, String position, int phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void nameis() {
        System.out.println("Имя работника: " + name);
    }

    void positionis() {
        System.out.println("Должность: " + position);
    }

    void phoneis() {
        System.out.println("Телефон: " + phone);
    }

    void salaryis() {
        System.out.println("Зарплата: " + salary);
    }

    void ageis() {
        System.out.println("Возраст: " + age);
    }


//1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
//2 Конструктор класса должен заполнять эти поля при создании объекта;
//3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
//4 Вывести при помощи методов из пункта 3 ФИО и должность.
//5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
//6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
}



