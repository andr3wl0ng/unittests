package diana.homework_01_09;

public class Numbers_arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        int product = 1;
        int diff = 0;
        float avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum=sum+numbers[i];
            product=product*numbers[i];
            diff=diff-numbers[i];
        }
        avg=sum/numbers.length;
        System.out.println("Sum is " + sum);
        System.out.println("Product is " + product);
        System.out.println("Difference is " + diff);
        System.out.println("Average is " + avg);
    }
}
