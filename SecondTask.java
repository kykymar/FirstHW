package ru.geekbrains.lesson1.FirstHW.git;

public class SecondTask {
    public static void main(String[] args) {
        System.out.println("Результат " + methodName1(6, 12));
        integer(-5);
        System.out.println("Результат " + positiveOrNegative(-3));
        printWordNTimes("hello", 8);

    }

    public static boolean methodName1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }

    }

    public static void integer(int a) {
        if (a >= 0) {
            System.out.println("положительное");
        } else {
            System.out.println("отрицательное");
        }
    }

    public static boolean positiveOrNegative(int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printWordNTimes(String word, int times) {
        for (int i = 1; i < times+1; i++) {
            System.out.println(word);
        }
    }
}
