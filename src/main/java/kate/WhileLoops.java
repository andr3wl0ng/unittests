package kate;

public class WhileLoops {
    public static void main(String[] args) {
        int value = 500;
        int month = 1;
        while (month <= 12) {
            System.out.println(month+" month "+value);
            month = month+1;
            value = value+1000;
        }
    }
}
