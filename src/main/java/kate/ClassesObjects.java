package kate;

public class ClassesObjects {
    public static void main(String[] args) {
        Person myDescription = new Person("Kateryna", "30");
//        myDescription.name = "Kateryna";
//        myDescription.age = 30;
        System.out.println("My name is " + myDescription.name + "," + " i'm " + myDescription.age + " years old");

    }
}

class Person {
    String name;
    int age;

    Person (String nameValue, String stringAgeValue) {
        this.name=nameValue;
        this.age=Integer.parseInt(stringAgeValue);
    }
}
