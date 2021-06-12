package ru.geekbrains.lesson1.FirstHW.git;

import java.util.Arrays;



public class ThirdTask {

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        System.out.print("Results " + returnArray(4,257));
    }

    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {arr[i] = 1;}
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        } System.out.println(" ");
        System.out.println("* * * * * * *");
    }


    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("* * * * * * *");
    }
    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++)
        {System.out.print(arr [i] + " ");
            }
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] < 6) {arr [i] = arr [i] * 2;}
            System.out.print(arr [i] + " ");
            } System.out.println(" ");
        System.out.println("* * * * * * *");
        }

    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++)
        {for (int j = 0; j < arr.length; j++)
        {
            if (i == j) {arr[i][j] = 1;}

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    /* С данным заданием проблемы. В большей степени списала с разбора домашки. Строка со значениями не выходит. Не могу определить ошибку.
     */
    public static int[] returnArray(int len, int initValue) {
        int[] tempArray = new int[len];
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = initValue;
        }
return tempArray;
    }
}


