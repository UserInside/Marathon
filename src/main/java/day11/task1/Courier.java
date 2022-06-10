package day11.task1;

public class Courier implements Worker {
    private int salary;
    private boolean isPaid = false;
    private Warehouse wh;
    private int bonus = 50000;
    private int norm = 10000;


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
        if (wh.getCountDeliveredOrders() == norm) bonus();
    }

    public void bonus(){
        if (getIsPaid()) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (wh.getCountDeliveredOrders() < norm){
            System.out.println("Бонус пока не доступен");
        } else {
            salary += bonus;
            isPaid = true;
        }
    }




}
