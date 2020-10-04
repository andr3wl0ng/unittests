package diana.homework_29_09;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class removeDuplicates {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter numbers separated with coma");

        String numbersInString = myObj.nextLine();  // Read user input
        System.out.println("Raw numbers: " + numbersInString);  // Output user input
        String[] numbersInArray;
        numbersInArray = numbersInString.split(",");
        Set<String> numbersInSet = new HashSet<>();
        for (int i = 0; i < numbersInArray.length; i++) {
            numbersInSet.add(numbersInArray[i]);
        }

        System.out.println("Numbers without duplication: " +numbersInSet.toString());
    }
}
