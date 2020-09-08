package lessons.lesson5;

import lessons.lesson5.HumanPrivate;
import lessons.lesson5.HumanPublic;

public class Lesson5 {
    public static void main(String [] args){

        System.out.println("Human public class");
        HumanPublic firstHuman = new HumanPublic();
//        firstHuman.age = 10;
//        firstHuman.name = "Alex";
//        firstHuman.surname = "Ale";
        firstHuman.setAge(10);
        firstHuman.setName("Alex");
        firstHuman.setSurname("Ale");

        firstHuman.setAge(10000);

//        System.out.println("Age is:" + firstHuman.age);
//        System.out.println("Name is:" + firstHuman.name);
//        System.out.println("Surname is:" + firstHuman.surname);
        System.out.println("Age is:" + firstHuman.getAge());
        System.out.println("Name is:" + firstHuman.getName());
        System.out.println("Surname is:" + firstHuman.getSurname());

        firstHuman.printAge();
        firstHuman.printName();
        firstHuman.printSurname();



        System.out.println("\nHuman private class");
        HumanPrivate firstPrivateHuman = new HumanPrivate("Andrii", "Dovgiy", 28);

        firstPrivateHuman.setAge(10000);

        System.out.println("Age is:" + firstPrivateHuman.getAge());
        System.out.println("Name is:" + firstPrivateHuman.getName());
        System.out.println("Surname is:" + firstPrivateHuman.getSurname());

        firstPrivateHuman.printAge();
        firstPrivateHuman.printName();
        firstPrivateHuman.printSurname();
    }
}
