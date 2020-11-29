package HW1;

import java.util.Scanner;


public class HW1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Задание 1.");
        Types();
        System.out.println("\nЗадание 2.");
        System.out.println("Введите a");
        float a = scanner.nextFloat();
        System.out.println("Введите b");
        float b = scanner.nextFloat();
        System.out.println("Введите c");
        float c = scanner.nextFloat();
        System.out.println("Введите d. d!=0");
        float d = scanner.nextFloat();
        System.out.println("a * (b + (c / d))= "+Solution(a,b,c,d));
        System.out.println("\nЗадание 3.");
        System.out.println("Введите первое число");
        int e = scanner.nextInt();
        System.out.println("Введите второе число");
        int f = scanner.nextInt();
        System.out.println("сумма лежит в пределах от 10 до 20 (включительно),\n" +
                "если да – вернуть true, в противном случае – false. \n результат:"+FromTenToTwenty(e, f));
        System.out.println("\nЗадание 4.");
        PositiveOrNegative(e);
        System.out.println("\nЗадание 5.");
        System.out.println(f + "  " + PositiveOrNot(f));
        System.out.println("\nЗадание 6.");
        System.out.println("Введите имя");
        String name = scanner.next();
        HelloName(name);
        System.out.println("\nЗадание 7.");
        System.out.println("Введите год");
        int year = scanner.nextInt();
        WhichYear(year);
    }


    //1  Создать переменные всех пройденных типов данных и инициализировать их значения.
    private static void Types(){
        System.out.println("Существует 8 примитивных типов данных");
        byte a= 125;
        System.out.println("byte = " + a);
        short b= 32766;
        System.out.println("short = " + b);
        int c= -21474836;
        System.out.println("int = " + c);
        long l=200000L;
        System.out.println("long = " + l);
        float f=12.23f;
        System.out.println("float = " + f);
        double d=-123.123;
        System.out.println("double = " + d);
        char ch =  87;
        System.out.println("char = " + ch);
        boolean bb =  true;
        System.out.println("boolean = " + bb);
    }

    //2 Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //                где a, b, c, d – аргументы этого метода, имеющие тип float.
    private static float Solution (float a,float b,float c,float d) {
        float result=a * (b + (c / d));
        return result;
    }

    //3   Написать метод, принимающий на вход два целых числа и проверяющий,
    // что их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    private static boolean FromTenToTwenty(int a, int b) {
        boolean result = a + b >= 10 && a + b <= 20;
        int sum = a + b;
        return result;
    }


    //4   Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    // положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    private static void PositiveOrNegative(int a) {
        if (a >= 0) System.out.println(a + " Положительное число");
        else System.out.println(a +" Отрицательное число");
    }


    //5   Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    private static boolean PositiveOrNot(int a) {
        boolean result = a>=0;
        return result;
    }

    //6   Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    private static void HelloName (String name){
        System.out.println("Привет, "+ name);
    }



    //7  *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    private static void WhichYear (int year){
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0) && (year % 100 != 0)) System.out.println(year+" - високосный год");
        else System.out.println(year+" - невисокосный год");
    }

}