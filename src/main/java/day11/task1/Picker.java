package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPaid = false;
    private Warehouse wh;
    private int bonus = 70000;
    private int norm = 10000;

    public Picker(Warehouse wh) {
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
        return "Сборщик обработал " + wh.getCountPickedOrders() + " заказов. Зарплата составила " + salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        wh.countPickedOrders = wh.getCountPickedOrders() + 1;
        if (wh.getCountPickedOrders() == norm) {
            bonus();
        }


    }

    @Override
    public void bonus() {
        if (isPaid) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (wh.getCountPickedOrders() < norm) {
            System.out.println("Бонус пока не доступен");
        } else {
            salary += bonus;
            isPaid = true;
        }

    }
}
