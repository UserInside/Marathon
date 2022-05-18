package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setModel("BMW");
        car.setColor("Blue");
        car.setProductionYear(2015);

        System.out.println("Car model is " + car.getModel() +
                "\nCar color is " + car.getColor() +
                "\nProduction year is " + car.getProductionYear());
    }
}

class Car {
    private String model;
    private String color;
    private int productionYear;

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getProductionYear() {
        return productionYear;
    }
}


