package kate;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {
    public static void main(String[] args) {
     /*   String[] names = new String[10];
        names[9] = "zero";
        names[6] = "one";
        names[8] = "two";
        names[0] = "tree";
        //names[10] = "four";
        System.out.println(names[9]);

        List<Person> persons = new ArrayList();
        persons.add(new Person("Kate", "30"));
        persons.add(0,new Person("Kate", "20"));
        System.out.println();*/

        int [] number = new int [11];
        for (int i=0; i<number.length; i++) {
            number[i] = i * 10;
            System.out.println(number[i]);
        }
    }
}
