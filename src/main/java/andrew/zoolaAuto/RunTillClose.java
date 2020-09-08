package andrew.zoolaAuto;

import java.util.Scanner;

public class RunTillClose {
    public static void main(String[] args) {
        System.out.println("HI. This program will will run till you type 'CLOSE'");
        String glitch = "Enter the word: ";
        Scanner scanner = new Scanner(System.in);
        String forClose = scanner.nextLine();

        switch (forClose){
            case "Close":
                System.out.println("program is ended");
                break;
        }
    }
}
