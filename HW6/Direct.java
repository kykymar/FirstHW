package ru.geekbrains.lesson1.FirstHW.git.HW6;

public class Direct {
    public static void main(String[] args) {
        String tempWinEvent = "Done!";
        String tempLossEvent = "Fail!";
        String actName;
        String actResult;

Cat cat1 = new Cat("Cat Kelly", 300f, 1f);
Cat cat2 = new Cat("Cat Bobby", 120f, 0f);
Dog dog1 = new Dog("Dog Jacky", 500f, 14f);
Dog dog2 = new Dog("Dog Humpy", 750f, 25f);

Animal[] animals = {cat1, cat2, dog1, dog2};

float runLength = 270f;
float swimLength = 15f;

        for (int i = 0; i < animals.length; i++) {
            String nameString = animals[i].getName() + " can ";
            actName = "run " + animals[i].getMaxRun() + " m. Trying to run ";
            actResult = animals[i].run(runLength) ? tempWinEvent : tempLossEvent;
            result(nameString, actName, runLength, actResult);

            int swimResult = animals[i].swim(swimLength);
            actName = "swim " + animals[i].getMaxSwim() + " m. Trying to swim ";
            actResult = (swimResult == Animal.canSwim) ? tempWinEvent : tempLossEvent;

            if (swimResult == Animal.dontSwim)
                actResult = "It doesn't swim.";
            result(nameString, actName, swimLength, actResult);
        }
    }

    private static void result(String nameAnimal, String event, float eventLength, String resultEvent) {
        System.out.println(nameAnimal + event + eventLength + " m. " + resultEvent);

    }
}
