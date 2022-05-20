package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("odin", 50, 30, 50);
        Airplane a2 = new Airplane("vtoroi", 30, 30, 30);

        Airplane.compareAirplanes(a1, a2);


    }
}