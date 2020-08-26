package kate;

public class If {
    public static void main(String[] args) {
        boolean girl = Boolean.parseBoolean("Do you dance?");
        String boy1 = "-not really";
        String boy2 = "-Would you like to have a cup of coffee";
        if (girl = true) {
            System.out.println("-Do you dance? "+boy1);
        } else if(girl = false); {
            System.out.println(boy2);
        }
    }
}
