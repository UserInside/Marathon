package day11.task1;

public class Courier implements Worker {
    int salary;
    boolean isPaid = false;
    Warehouse wh;

    public Courier(Warehouse wh) {
        this.wh = wh;
    }

    public int getSalary() {
        return salary;
    }

    public boolean getIsPaid() {
        return isPaid;
    }

    @Override
    public String toString() {
        return "Курьер обработал " + wh.getCountDeliveredOrders() + " заказов. Зарплата составила " + salary;
    }

    public void doWork(){
        salary += 100;
        wh.countDeliveredOrders = wh.getCountDeliveredOrders() + 1;
        if (wh.getCountDeliveredOrders() == 10000) bonus();
    }

    public void bonus(){
        if (getIsPaid()) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (wh.getCountDeliveredOrders() < 10000){
            System.out.println("Бонус пока не доступен");
        } else {
            salary += 50000;
            isPaid = true;
        }
    }




}
