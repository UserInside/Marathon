package day11.task1;

public class Picker implements Worker {
    int salary;
    boolean isPaid = false;
    Warehouse wh;

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
        if (wh.getCountPickedOrders() == 10000) {
            bonus();
        }


    }

    @Override
    public void bonus() {
        if (isPaid) {
            System.out.println("Бонус уже был выплачен");
            return;
        }
        if (wh.getCountPickedOrders() < 10000) {
            System.out.println("Бонус пока не доступен");
        } else {
            salary += 70000;
            isPaid = true;
        }

    }
}
