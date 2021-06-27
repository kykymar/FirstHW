package ru.geekbrains.lesson1.FirstHW.git;

public class HW5 {
    public static void main(String[] args) {
Employee emp = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "9211234567", 75000, 1979);

Employee[] office = {
     emp,
             new Employee("Petrov Petr", "Programming", "petr@mailbox.com", "9211664567", 95000, 1992),
             new Employee("Lenina Elena", "HR", "lena@mailbox.com", "9211214567", 55000, 1990),
             new Employee("Irina Irina", "Accountant", "ira@mailbox.com", "9111234567", 95000, 1976),
             new Employee("Ivanova Julia", "Head", "julia@mailbox.com", "9111598567", 195000, 1981)
         };

         getAllPersonsInOffice(office);
         System.out.println("-------------------");
         getOldPerson(office, 40);
    }

     private static void getOldPerson(Employee[] office, int year) {
          for (int i = 0; i < office.length; i++)
               if (office[i].getAge() > year) {
                    System.out.println(office[i].getFullInfo());
               }
     }


     private static void getAllPersonsInOffice(Employee[] office) {
          System.out.println("All person: ");
          for (int i = 0; i < office.length; i++)
               System.out.println((i + 1) + " " + office[i].getFullInfo());
     }
    }

