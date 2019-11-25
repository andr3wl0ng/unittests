package coffeeMachine;
import java.util.Scanner;

public  class CoffeeMachine {
    public static void main(String[] args) {
        SelectYourDrink();

        boolean statusOK = true;
        while (statusOK) {
            Scanner scanner = new Scanner(System.in);
            int selection = scanner.nextInt();
            Recipes.Drink drink = Recipes.Drink.getDrinkByType(selection);

            if (drink == null) {
                System.out.println("Wrong Drink Type");
            } else {
                statusOK = CoffeeMaker.prepareDrink(drink);
                System.out.println("You drink: " + drink.getDrinkName() + " Is ready. Please, enjoy");
                int selectionRepeat = getSelectionRepeat();

                if(selectionRepeat == 1){
                    SelectYourDrink();
                } else {
                    break;
                }
            }
        }
    }

    private static int getSelectionRepeat() {
        System.out.println("__________________________");
        Scanner scannerRepeat = new Scanner(System.in);
        System.out.println("Another drink?");
        System.out.println("To continue press - 1; To exit press 0");
        return scannerRepeat.nextInt();
    }

    private static void SelectYourDrink() {
        System.out.println("For 'Espresso' press - 1");
        System.out.println("For 'Americano' press - 2");
        System.out.println("For 'Americano With Milk' press - 3");
        System.out.println("For 'Late' press - 4");
        System.out.println("For 'Hot Water' press - 5");
        System.out.println("__________________________");
        System.out.println("Select your drink and press ENTER:");
    }
}


