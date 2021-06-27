package ru.geekbrains.lesson1.FirstHW.git;

public class Employee {
    private static int CURRENT_YEAR = 2021;
    private String name;
    private String position;
    private String email;
    private String number;
    private int salary;
    private int year;

    public Employee(
            String name,
            String position,
            String email,
            String number,
            int salary,
            int year
    ) {
    this.name =name;
    this.position =position;
    this.email =email;
    this.number =number;
    this.salary =salary;
    this.year =year;
}
int getAge() { return CURRENT_YEAR - year;}
    int getSalary() {return salary;}
    String getName() {return name;}
    String getPosition() {return position;}
    String getEmail() {return email;}
    String getNumber() {return number;}

    String getFullInfo() {
        return this.name + " " +
                this.position + " " +
                this.email + " " +
                this.getAge() + " years old, " +
                this.getSalary() + " RU, +7" +
                this.number + " ";

    }


}
