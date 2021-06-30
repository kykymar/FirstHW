package ru.geekbrains.lesson1.FirstHW.git.HW7;

import java.util.Scanner;

public class HW7 extends Object{
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] value = {0,0,0,0,0,0};
        System.out.println(value.toString() + " Nina");

        for (int i = 0; i < value.length; i++) {
            System.out.print(value[i]);
        }
        System.out.print(" Nina");


        String testString = "ExampleText";
        StringBuilder testStringBuilder = new StringBuilder("ExampleText");

        long startTime = System.nanoTime();

        for (int i = 0; i < 50000; i++) {
            testString += i;
        }

        float deltaTime = System.nanoTime() - startTime;
        System.out.println(testString);
        System.out.println("Time String > " + deltaTime * 0.000001f + " millisec.");

        startTime = System.nanoTime();

        for (int i = 0; i < 50000; i++) {
            testStringBuilder.append(i);
        }
        deltaTime = System.nanoTime() - startTime;
        System.out.println(testStringBuilder.toString());
        System.out.println("Time SB > " + deltaTime * 0.000001f + " millisec.");
        System.out.println(testString.equals(testStringBuilder.toString()));

    }
}
