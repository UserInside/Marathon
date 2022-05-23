package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println("Сумма периметров красных фигур равна " + calculateRedPerimeter(figures));
        System.out.println("Сумма площадей красных фигур равна " + calculateRedArea(figures));

    }

        public static double calculateRedPerimeter(Figure[] figures) {
            double perimeterSum = 0;
            for (Figure figure : figures) {
                if (figure.getColor().equals("Red")) {
                    perimeterSum += figure.perimeter();
                }
            }
            return perimeterSum;

        }

        public static double calculateRedArea(Figure[] figures) {
            double areaSum = 0;
            for (Figure figure : figures) {
                if (figure.getColor().equals("Red")) {
                    areaSum += figure.area();
                }
            }
            return areaSum;

        }



}
