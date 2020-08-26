package andrew.zoolaAuto;
import java.util.Scanner;

public class IntroduceMySelf {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("What do you want to know about me?");
        myInfo();
        Scanner scanner = new Scanner(System.in);
        int infoSelect = scanner.nextInt();
        switch (infoSelect){
            case 1:
                generalInfo();
                break;
            case 2:
                occupationInfo();
                break;
            case 3:
                allInfo();
                break;
            case 0:
                break;
            default:
                System.out.println("Wrong selection");
                myInfo();
        }

    }

    public static void myInfo() {
        System.out.println("For 'General Info' press - 1");
        System.out.println("For 'Occupation Info' press - 2");
        System.out.println("For 'All Info' press - 3");
        System.out.println("For 'Exit' press - 0");
        System.out.println("__________________________");
        System.out.println("Select your drink and press ENTER:");
    }

    public static void generalInfo(){
        String generalInfo = "My name is Andrew. I'm 28 y.o.; favourite hobby - Snowboarding";
        System.out.println(generalInfo);
    }

    public static void occupationInfo(){
        String occupationInfo = "I'm working in the Zoolatech company; Credible project; My position is - Manual QA Engineer";
        System.out.println(occupationInfo);
    }

    public static void allInfo(){
        generalInfo();
        occupationInfo();
    }
}
