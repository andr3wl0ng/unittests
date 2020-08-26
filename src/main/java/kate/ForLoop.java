package kate;

public class ForLoop {
    public static void main(String[] args) {
        int month = 1;
        for (int i = 200;month <= 12;i = i+1000) {
            System.out.println(month+" month "+i);
            month = month + 1;
        }
    }
}
