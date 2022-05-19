package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2015);
        car.info();
        System.out.println("Возраст авто " + car.yearDifference(2022) + " лет");

        Motorbike motorbike = new Motorbike("Honda", "black", 2010);
        motorbike.info();
        System.out.println("Возраст мотоцикла " + motorbike.yearDifference(2022) + " лет");

    }
}
