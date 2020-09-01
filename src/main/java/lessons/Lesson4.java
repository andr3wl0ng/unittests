package lessons;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lesson4 {
    public static void main(String [] args){

        List<String> testList = new ArrayList<>();
        String firstString = "First";
        String secondString = "Second";
        testList.add(firstString);
        testList.add(secondString);
        testList.forEach(el -> {
//            if (el.equals("First")){
//                System.out.println(el);
//            }
            switch (el){
                case "First":
                    System.out.println("First");
                default:
//                    System.out.println("Default block");
                    break;
            }
        });





    }
}
