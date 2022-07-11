package day18;

public class  Task2 {
    public static void main(String[] args) {
        System.out.println(count7(7007724));
    }

    public static int count7(int number) {
        int cnt = 0;
        return count(cnt, number);
    }

    public static int count(int cnt, int number) {
        if (number == 0) return cnt;
        if (number % 10 == 7) cnt += 1;

        return count(cnt, number/10);
    }

}
