package coffeeMachine;

public class Recipes {

    /**
     * index 0 = coffee
     * index 1 = water
     * index 2 = milk
     * index 3 = sugar
     */

    enum Drink {

        ESPRESSO            (1, 1, 0, 0,1,"Espresso"),
        AMERICANO           (2, 3, 0, 0,2,"Americano"),
        AMERICANOWITHMILK   (2, 3, 3, 0,3,"Americano with milk"),
        LATE                (1, 1, 3, 1,4,"Late"),
        HOTWATER            (0, 1, 0, 0,5,"Hot water");

        private final int coffee;
        private final int water;
        private final int milk;
        private final int sugar;
        private final int drinkType;
        private final String drinkName;

        Drink(int coffee, int water, int milk, int sugar, int drinkType, String drinkName) {
            this.coffee = coffee;
            this.water = water;
            this.milk = milk;
            this.sugar = sugar;
            this.drinkType = drinkType;
            this.drinkName = drinkName;
        }

        public static Drink getDrinkByType(int type) {
            for (Drink drink : values()) {
                if (drink.getDrinkType() == type) {
                    return drink;
                }
            }
            return null;
        }


        public int getCoffee() {
            return coffee;
        }
        public int getWater() {
            return water;
        }
        public int getMilk() {
            return milk;
        }
        public int getSugar() {
            return sugar;
        }
        public int getDrinkType() {
            return drinkType;
        }
        public String getDrinkName() {
            return drinkName;
        }
    }





//   public static int [] espresso             = new int []{1, 1, 0, 0 };
//   public static int [] americano            = new int []{2, 3, 0, 0 };
//   public static int [] americanoWithMilk    = new int []{2, 3, 3, 0 };
//   public static int [] late                 = new int []{1, 1, 3, 1 };
//   public static int [] hotWater             = new int []{0, 1, 0, 0 };





//    public static void main(String[] args) {
//
//
//        RecipeComponentBase espresso = new RecipeComponentBase();
//        espresso.preparedDrink = espresso.coffee + espresso.water / 2;
//
//        RecipeComponentBase americano = new RecipeComponentBase();
//        americano.preparedDrink = (americano.coffee * 2) + (americano.water * 3);
//
//        RecipeComponentBase americanoWithMilk = new RecipeComponentBase();
//        americanoWithMilk.preparedDrink = (americanoWithMilk.coffee * 2) + (americanoWithMilk.water * 3) + americanoWithMilk.milk;
//
//        RecipeComponentBase doubleEspresso = new RecipeComponentBase();
//        doubleEspresso.preparedDrink = espresso.coffee * 2;

}