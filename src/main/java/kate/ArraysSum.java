package kate;

public class ArraysSum {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 4};
        int sum = 0;

        for (int x : numbers) sum += x;
        System.out.println(sum);
    }
}
/* int [] numbers = {2,3,4};
    int sum = 0;
    sum = Arrays.stream(numbers).sum();
            System.out.println(sum);*/