package day11.task1;

public class Warehouse {
    int countPickedOrders;
    int countDeliveredOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    @Override
    public String toString() {
        return "Получено заказов - " + countPickedOrders + "\nОтправлено заказов - " + countDeliveredOrders;
    }
}
