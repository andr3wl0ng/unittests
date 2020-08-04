package andrew.coffeeMachine;

public class CoffeeMaker {

    public static int coffeeTankCapacity    = 10;
    public static int waterTankCapacity     = 50;
    public static int milkTankCapacity      = 10;
    public static int sugarTankCapacity     = 10;
    public static int trashTankCapacity     = 10;

    /*********************
     * index 0 = coffee
     * index 1 = water
     * index 2 = milk
     * index 3 = sugar
     *********************/

    public static boolean prepareDrink(Recipes.Drink drink) {



        if(        (coffeeTankCapacity  >=  drink.getCoffee())
                && (waterTankCapacity   >=  drink.getWater())
                && (milkTankCapacity    >=  drink.getMilk())
                && (trashTankCapacity   >=  drink.getCoffee())
                && (trashTankCapacity   >=  drink.getCoffee())) {

            coffeeTankCapacity = coffeeTankCapacity - drink.getCoffee();
            waterTankCapacity = waterTankCapacity - drink.getWater();
            milkTankCapacity = milkTankCapacity - drink.getMilk();
            trashTankCapacity = trashTankCapacity - drink.getCoffee();
            sugarTankCapacity = sugarTankCapacity- drink.getSugar();

            return true;

        } else {
            return false;

        }
    }


}
