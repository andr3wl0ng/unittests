package kate;

public class DoWhile {
    public static void main(String[] args) {
        int value = 700;
        int month = 1;
        do{
            System.out.println(month+" month "+value);
            month = month+1;
            value = value+1000;
        }
        while (month <= 12);
        System.out.println("Finish");
    }
}
