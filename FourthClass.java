package ru.geekbrains.lesson1.FirstHW.git;
import java.util.Scanner;
import java.util.Random;

public class FourthClass {

    public static char[][] map;
    public static int mapWidth;
    public static int mapHeight;

    public static char playerHuman = 'x';
    public static char playerEnemy = 'o';
    public static char emptyField = '_';

    public static Scanner pencil = new Scanner(System.in);
    public static Random random = new Random();
    public static int winLength;

    public static void main(String[] args) {
        createMap();
        showerMap();

        while(true) {
        turnPlayerHuman();
        showerMap();
        if (isWin(playerHuman)) {
            System.out.println("Human win");
            break;
        }
        if (isDraw()) {
            System.out.println("Draw");
            break;
        }

        turnPlayerEnemy();
        showerMap();
        if (isWin(playerEnemy)) {
            System.out.println("PC win");
            break;
        }
        if (isDraw()) {
            System.out.println("Draw");
            break;
        } }
    }

    public static void createMap() {
        mapWidth = 5;
        mapHeight = 5;
        winLength = 4;
        map = new char[mapHeight][mapWidth];

        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                map[y][x] = emptyField;
            }
        }
    }

    public static void showerMap() {
        for (int y = 0; y < mapHeight; y++) {
            System.out.print("|");
            for (int x = 0; x < mapWidth; x++) {
                System.out.print(map[y][x] + "|");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void turnPlayerHuman() {
        int x;
        int y;
        do {
            System.out.print("Please enter your coordinates: ");
            x = pencil.nextInt() - 1;
            y = pencil.nextInt() - 1;
        }
        while (!isValidField(y, x) || !isEmptyField(y, x));

        map[y][x] = playerHuman;
        System.out.println("Human turn in [" + (x + 1) + ";" + (y + 1) + "]");

    }

    public static void turnPlayerEnemy() {
        int x;
        int y;

        do {
            x = random.nextInt(mapWidth);
            y = random.nextInt(mapHeight);
        } while (!isEmptyField(y, x));

        map[y][x] = playerEnemy;
        System.out.println("Enemy turn in [" + (x + 1) + ":" + (y + 1) + "]");
    }

    public static boolean isEmptyField(int y, int x) {
        return map[y][x] == emptyField;
    }

    public static boolean isValidField(int y, int x) {
        return x >= 0 && x < mapWidth && y >= 0 && y < mapHeight;
    }

    public static boolean isDraw() {
        for (int y = 0; y < mapHeight; y++) {
            for (int x = 0; x < mapWidth; x++) {
                if (map[y][x] == emptyField) {
                    return false;
                }
            }
        }
        return true;

    }

    public static boolean isWin(char c) {
        for (int i = 0; i < mapWidth; i++) {
            for (int j = 0; j < mapHeight; j++) {
                if (checkLine(i, j, 1, 0, winLength, c)) {
                    return true;
                }
                if (checkLine(i, j, 1, 1, winLength, c)) {
                    return true;
                }
                if (checkLine(i, j, 0, 1, winLength, c)) {
                    return true;
                }
                if (checkLine(i, j, 1, -1, winLength, c)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkLine(int x, int y, int vx, int vy, int len, char c) {
        final int farX = x + (len - 1) * vx;
        final int farY = y + (len - 1) * vy;
        if (!isValidField(farX, farY)) {
            return false;
        }
        for (int i = 0; i < len; i++) {
            if (map[y + i * vy][x + i * vx] != c) {
                return false;
            }
        }
        return true;
    }
}


