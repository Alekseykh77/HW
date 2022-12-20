package hw1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class hw1 {
    public static void main(String[] args) {
        System.out.println(doTask1(7, 8));
        doTask2(0);
        System.out.println(doTask3(9));
        doTask4("cat", 8);
        System.out.println(doTask5(2022));
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        doTask6(arr);
        doTask7(100);
        int[] multiplyOn2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        doTask8(multiplyOn2);
        doTask9();
        doTask10(4, 5);
        int[] arr1 = {8, 6, 4, 12, 21, 3, 0, 5};
        doTask11(arr1);

    }


    /* 1.Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.*/
    static boolean doTask1(int a, int b) {
        System.out.println("\nЗадание 1");
        System.out.print("Сумма лежит в пределах от 10 до 20: ");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }


    /* 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.*/
    static void doTask2(int a) {
        System.out.println("\nЗадание 2");
        if (a >= 0) System.out.println("Число " + a + " положительное");
        else System.out.println("Число " + a + " отрицательное");
    }


    /* 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true,
    если число отрицательное, и вернуть false если положительное.*/
    static boolean doTask3(int a) {

        System.out.println("\nЗадание 3");
        if (a < 0) return true;
        else return false;
    }

    /* 4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз;*/
    static void doTask4(String str, int n) {
        System.out.println("\nЗадание 4");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + ")" + str + " ");
        }
    }

    /* 5. *Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true,
    не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный. .*/

    static boolean doTask5(int year) {
        System.out.println("\nЗадание 5");
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    /* 6. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

    static void doTask6(int[] arr) {
        System.out.println("\nЗадание 6");
        System.out.println("Заданный массив:\t\t" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] == 1) ? 0 : 1;
        }
        System.out.println("Инвертированный массив:\t" + Arrays.toString(arr) + "\n");
    }

    /* 7. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;*/

    static void doTask7(int size) {
        System.out.println("\nЗадание 7");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }

    /* 8. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;*/
    static void doTask8(int[] multiplyOn2) {
        System.out.println("\nЗадание 8");
        for (int i = 0; i < multiplyOn2.length; i++) {
            if (multiplyOn2[i] < 6) {
                multiplyOn2[i] = multiplyOn2[i] * 2;
            }
            System.out.print(multiplyOn2[i] + " ");
        }
        System.out.print("\n");
    }
    /* 9. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     Определить элементы одной из диагоналей можно по следующему принципу:
     индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n]; */

    static void doTask9() {
        System.out.println("\nЗадание 9");
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
    /* 10. Написать метод, принимающий на вход два аргумента: len и initialValue,
     и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;  */

    static void doTask10(int len, int initialValue) {
        System.out.println("\nЗадание 10");
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
        System.out.print("\n");
    }

    /* 11. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;    */
    static void doTask11(int[] arr1) {
        System.out.println("\nЗадание 11");
        int max = arr1[0];
        int min = arr1[0];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}