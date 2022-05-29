package day11.task1;

public class Courier extends Warehouse implements Worker {

    private Warehouse warehouse;

    public int getSalary() {
        return salary;
    }
  public void setSalary(int salary) {
    this.salary =  salary;
  }

    public boolean getIsPaid() {
        return isPaid;
    }
    public void setIsPaid (boolean isPaid) {
        this.isPaid = isPaid;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String toString() {
        return "Заказов доставлено - " + warehouse.getCountDeliveredOrders() + ". Зарплата к выдаче - " + getSalary();
    }

    public void doWork() {
        salary += 100;
        warehouse.setCountDeliveredOrders(warehouse.getCountDeliveredOrders() + 1);
        if (warehouse.getCountDeliveredOrders() == 10000) {
            bonus();
        }

    }

    public void bonus() {
        if (getIsPaid()) {
            System.out.println("Бонус уже был выплачен");
        } else {
            if (warehouse.getCountDeliveredOrders() < 10000) {
                System.out.println("Бонус пока не доступен");
            } else if (warehouse.getCountDeliveredOrders() >= 10000) {
                setSalary(getSalary() + 50000);
                setIsPaid(true);
            }
        }
    }
}
