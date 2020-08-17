package kate;

public class TypesVariables {
    public static void main(String[] args) {
        int myInt;
        myInt=1234567890;
        byte myByte=127;
        short myShort=22222;
        float myFloat=4.5f;
        double d=55555.99;
        char c= 'z';
        boolean b=true;

        double a1 = 17.6;
        double a2 = 14.8;
        int a3 = (int) (a1 + a2);
        int a4 = (int)a1 + (int)a2;
        System.out.println (myByte+ " "+myInt+ " "+myShort+ " "+myFloat+ " "+d+ " "+c+ " "+b);
        System.out.println (a3+ " "+a4);
    }
}