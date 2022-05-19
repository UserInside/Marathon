package day4;

public class Task4 {
    public static void main(String[] args) {
        int elementsAmount = 100;
        int dispersion = 10000;
        int group = 3;

        int[] array= new int[elementsAmount];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * dispersion);
        }
        int max = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 0; i < 97; i++) {
            int sum = 0;
            for (int j = 0; j < group; j++){
                sum += array[i+j];
            }

            if (sum > max) {
                max = sum;
                index = i;

            }
        }

        System.out.println(max+"\n"+index);


    }
}
