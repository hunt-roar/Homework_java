package HW2;

import java.util.Arrays;
import java.util.Scanner;

public class HW2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] EmptyArr = {1, 1, 1, 2, 1};
        int n = 2;
        ZeroandOne();
        CreateArr();
        LessThanSix();
        Square();
        MaxMin();
        System.out.println(SumofSides(EmptyArr));
    }


    //Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void ZeroandOne() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
        String intArrString = Arrays.toString(arr);
        System.out.println(intArrString);
    }


    //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    private static void CreateArr() {
        int[] EmptyArr = new int[8];
        for (int i = 1; i < EmptyArr.length; i++) {
            EmptyArr[i] = EmptyArr[i - 1] + 3;
        }
        String intArrString = Arrays.toString(EmptyArr);
        System.out.println(intArrString);
    }


    //    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static void LessThanSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
        String intArrString = Arrays.toString(arr);
        System.out.println(intArrString);
    }


    //    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    private static void Square() {
        int[][] EmptyArr = new int[10][10];
        for (int i = 0; i < EmptyArr.length; i++) {
            for (int j = 0; j < EmptyArr.length; j++) {
                if (i == j) EmptyArr[i][j] = 1;
            }
            String intArrString = Arrays.toString(EmptyArr[i]);
            System.out.println(intArrString);
        }
    }


    //Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    private static void MaxMin() {
        int[] arr = {9, 46, 2, 51, 55, 7, 9, 26, -10};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }
        System.out.println("min= " + min + "\nmax= " + max);
    }

    //Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
// checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
    private static boolean SumofSides(int[] EmptyArr) {
        int Leftsum = 0;
        int Rightsum = 0;
        for (int i = 0; i < EmptyArr.length; i++) {
            Rightsum += EmptyArr[i];
        }
        for (int i = 0; i < EmptyArr.length; i++) {
            Leftsum += EmptyArr[i];
            Rightsum -= EmptyArr[i];
            if (Leftsum == Rightsum) return true;
        }
        return false;
    }
}
