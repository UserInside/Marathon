package day18;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers));
    }

    public static int recursionSum(int[] numbers) {
        int sum = 0;
        int i = 0;
        return recursion(sum, i, numbers);
    }

    public static int recursion(int sum, int i, int[] numbers) {
        sum += numbers[i];
        if (i == numbers.length-1) return sum;
        return recursion(sum, i + 1, numbers);
    }
}
