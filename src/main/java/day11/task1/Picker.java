package day11.task1;

public class Picker extends Warehouse implements Worker {
    private Warehouse warehouse;

    public int getSalary() {
        return this.salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean getIsPaid() {
        return isPaid;
    }
    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;

    }

    public String toString() {
        return "Заказов поулчено " + warehouse.getCountPickedOrders() + ". Зарплата к выдаче - " + salary;
    }

    public void doWork() {
        salary += 80;
        warehouse.setCountPickedOrders(warehouse.getCountPickedOrders() + 1);
        if (warehouse.getCountPickedOrders() == 10000) {
            bonus();
        }

    }

    @Override
    public void bonus() {
        if (getIsPaid()) {
            System.out.println("Бонус уже был выплачен");
        } else {
            if (warehouse.getCountPickedOrders() < 10000) {
                System.out.println("Бонус пока не доступен");
            } else {
                setSalary(getSalary() + 70000);
                setIsPaid(true);
            }
        }


    }

}


