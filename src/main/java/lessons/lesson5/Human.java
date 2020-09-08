package lessons.lesson5;

import com.google.common.base.Strings;

public abstract class Human implements HumanAbilities{
    private String name;
    private String surname;
    private int age;

    public abstract void printAge();


    String getName() {
        return this.name;
    }

    String getSurname() {
        return this.surname;
    }

    int getAge() {
        return this.age;
    }

    void setAge(int age) {
        if (age > 0 && age < 130) {
            this.age = age;
        } else {
            System.out.println(String.format("Wrong age '%s'!", age));
        }
    }

    void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println(String.format("Wrong name '%s'!", name));
        }
    }

    void setSurname(String surname) {
        if (!surname.isEmpty()) {
            this.surname = surname;
        } else {
            System.out.println(String.format("Wrong surname '%s'!", surname));
        }
    }
}
