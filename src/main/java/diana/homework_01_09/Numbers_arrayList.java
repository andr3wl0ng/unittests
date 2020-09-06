package diana.homework_01_09;

import java.util.ArrayList;
import java.util.List;

public class Numbers_arrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        int sum = 0;
        int product = 1;
        int diff = 0;
        int avg = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
            product = product * numbers.get(i);
            diff = diff - numbers.get(i);
        }
        avg = sum / numbers.size();
        System.out.println("Sum is " + sum);
        System.out.println("Product is " + product);
        System.out.println("Difference is " + diff);
        System.out.println("Average is " + avg);
    }
}
