package lessons.lesson5;

public class HumanPrivate extends Human{

    HumanPrivate(String name, String surname, int age) {
        this.setName(name);
        this.setSurname(surname);
        this.setAge(age);
    }

    public void printAge() {
        System.out.println("Age is " + getAge());
    }

    @Override
    public void printName() {
        System.out.println("Name is " + getName());
    }

    @Override
    public void printSurname() {
        System.out.println("Surname is " + getSurname());
    }
}
