package andrew.zoolaAuto;

import java.util.Scanner;

public class Dialog {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Lets start dialog. Select with whom you want to talk:");
        System.out.println("With guy press - 1;");
        System.out.println("With girl press - 2;");
        selectPerson();


    }

    public static void selectPerson() {
        Scanner scanner = new Scanner(System.in);
        int selectPerson = scanner.nextInt();
        if (selectPerson == 1) {
            talkToTheGirl();
        } else if (selectPerson == 2) {
            talkToTheBoy();
        } else {
            System.out.println("Wrong selection");
        }

    }

    public static void talkToTheGirl() {
        System.out.println("Hello my name is Andrew. Do you want a cup of coffee?");
        System.out.println("Yes/No");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        String convert = answer.toUpperCase();
        if (convert.equals("YES")) {
            System.out.println("Awecome, lets meet at 4PM at Starbacks coffee!");
        } else if (convert.equals("NO")) {
            System.out.println("ok. Maybe next time :)");
        } else {
            System.out.println(" Not understand you!!!!");
        }
    }

    public static void talkToTheBoy() {
        System.out.println("Hello my name is Dana. Do you want a cup of coffee?");
        System.out.println("Yes/No");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        String convert = answer.toUpperCase();
        if (convert.equals("YES")) {
            System.out.println("Awecome, lets meet at 4PM at Starbacks coffee!");
        } else if (convert.equals("NO")) {
            System.out.println("ok. Maybe next time :)");
        } else {
            System.out.println(" Not understand you!!!!");
        }
    }

}
