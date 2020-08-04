package lessons;

public class Lesson2 {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str);
        //System.out.println("Hello World");
        Integer aq = 5;

        str = "Hello";
        System.out.println(str);
        String str1 = "a";
        String str2 = "b";
        String strRes = String.valueOf(str1 + str2);
        System.out.println(strRes);

        aq.toString();
        System.out.println(strRes.equals("a"));

        // i=i+1 equals i++

        for (int i = 1; i <= 110; i = i + 1) {
            if (i == 49) {
                System.out.println(i);
            } else {
                System.out.println(1);
            }
        }

        while (aq < 10) {
            System.out.println(aq);
            aq = aq + 1;
        }
        int a = 3;
        switch (a) {
            case 1:
                System.out.println("One");
                break;

            case 2:
                System.out.println("Two");
                break;

            case 3:
                System.out.println("Three");
                break;

            default:
                System.out.println("Out of range");
                break;
        }

    }
}

