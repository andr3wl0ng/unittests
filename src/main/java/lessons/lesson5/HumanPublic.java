package lessons.lesson5;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HumanPublic extends Human {

    public void printAge() {
        System.out.println(this.getAge());
    }

    @Override
    public void printName() {
        System.out.println("My name is " + getName());
    }

    @Override
    public void printSurname() {
        System.out.println("My surname is " + getSurname());
    }
}
