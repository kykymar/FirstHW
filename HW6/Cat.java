package ru.geekbrains.lesson1.FirstHW.git.HW6;

public class Cat extends Animal {

    public Cat(String name, float maxRun, float maxSwim) {
        super(name, maxRun, maxSwim);

    }

    @Override
    public int swim(float distance) {
        return Animal.dontSwim;
    }
}