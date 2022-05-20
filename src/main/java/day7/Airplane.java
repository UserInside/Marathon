package day7;

import org.jetbrains.annotations.NotNull;

public class Airplane {
    private String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + manufacturer + ", год выпуска: " + year +
                        ", длина: " + length + ", вес: " + weight +
                        ", количество топлива в баке: " + fuel);
    }

    public void fillUp(int liters) {
        fuel += liters;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.getLength() > airplane2.getLength()) {
            System.out.println("Первый самолет длиннее");
        }
        else if (airplane1.getLength() == airplane2.getLength()) {
            System.out.println("Длины самолетов равны");
        } else {
            System.out.println("Второй самолет длиннее");
        }


    }
}
