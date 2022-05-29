package day11.task1;

public class Warehouse {
    private int countPickedOrders = 0;
    private int countDeliveredOrders = 0;
    public int salary = 0;
    public boolean isPaid = false;

    public void setCountPickedOrders(int countPickedOrders) {
        this.countPickedOrders = countPickedOrders;
    }

    public void setCountDeliveredOrders(int countDeliveredOrders) {
        this.countDeliveredOrders = countDeliveredOrders;
    }

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public String toString() {
        return "Заказов получено - " + countPickedOrders + ".\nЗаказов отправлено - " + getCountDeliveredOrders();
    }


}
