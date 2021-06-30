package ru.geekbrains.lesson1.FirstHW.git.HW6;

public class Animal {

    static final int dontSwim = -1;
    static final int canSwim = 1;
    static final int noSwim = 0;

    protected String name;
    private float maxRun;
    private float maxSwim;

    Animal(String name, float maxRun, float maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    String getName() {
        return this.name;
    }

    float getMaxRun() {
        return this.maxRun;
    }

    float getMaxSwim() {
        return this.maxSwim;
    }

    protected boolean run(float distance) {
        return (distance <= maxRun);
    }

    protected int swim(float distance) {
        return (distance <= maxSwim) ? canSwim : noSwim;
    }

}
