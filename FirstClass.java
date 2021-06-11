package ru.geekbrains.lesson1.FirstHW.git;

public class FirstClass {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
    int a = -15;
    int b = 6;
        if (a+b>=0) {
                System.out.println("Сумма положительная");
                }
                if (a+b<0) {
        System.out.println("Сумма отрицательная");
        }}
                public static void printColor() {
        int value = 121;
        if (value <= 0)  {
        System.out.println("Красный");
        }
        if (value > 0 & value <=100)  {
        System.out.println("Желтый");
        }
        if (value > 100)  {
        System.out.println("Зелёный");
        }}

    public static void compareNumbers(){
        int a1 = 7;
        int b1 = 21;
        if (a1 >= b1) {
            System.out.println("a>=b");
        }
        if (a1 < b1) {
            System.out.println("a<b");
        }}}