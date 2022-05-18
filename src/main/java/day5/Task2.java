package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike moto = new Motorbike("Kawasaki", "Green", 2000);
        System.out.println("Motorbike  --> " + moto.getModel() +
                "\nColor --> " + moto.getColor() +
                "\nProduction Year --> " + moto.getProductionYear());
    }

}

class Motorbike {
    private String model;
    private String color;
    private int productionYear;

    public Motorbike(String model, String color, int productionYear) {
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }
}