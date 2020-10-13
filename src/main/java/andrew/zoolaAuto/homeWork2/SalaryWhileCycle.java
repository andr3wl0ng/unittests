package andrew.zoolaAuto.homeWork2;


public class SalaryWhileCycle {
    public static void main(String[] args) {
        int currentSalary = 0;
        int i = 0;
        while (i<=12){
            currentSalary = currentSalary+1000;
            i++;
            System.out.println("My current salary is "+currentSalary);
        }
    }
}
