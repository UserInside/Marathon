package day4;

public class Task4 {
    public static void main(String[] args) {
        int[] array= new int[100];

        for (int i = 0; i<100; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        int max = 0;
        int index = 0;
        for (int i = 0; i < 97; i++) {
            int sum = array[i] + array[i+1] + array[i+2];
            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        System.out.println(max+"\n"+index);


    }
}
