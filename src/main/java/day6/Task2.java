package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Suhoi", 2020, 30, 15000);
        airplane.setYear(1979);
        airplane.setLength(48);

        airplane.fillUp(300);
        airplane.fillUp(200);

        airplane.info();

    }
}
