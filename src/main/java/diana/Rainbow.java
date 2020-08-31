package diana;

public class Rainbow {
    public static void main(String[] args) {
        String[] a = {"Каждый ", " охотник ", " желает ", " знать ", " где ", " сидит ", " фазан "};
        String[] b = new String[7];
        for (int i = 0; i <= 6; i++) {
            b[i] = a[6 - i];
            System.out.println(b[i]);
        }
    }
}