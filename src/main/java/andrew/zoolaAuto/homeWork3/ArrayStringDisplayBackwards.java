package andrew.zoolaAuto.homeWork3;

public class ArrayStringDisplayBackwards {
    public static void main(String[] args) {
        String[] a = {" Каждый ", " охотник ", " желает ", " знать ", " где ", " сидит ", " фазан "};
        for (int i = a.length-1; i >= 0; --i) {
            System.out.println(a[i]);
        }
    }
}
