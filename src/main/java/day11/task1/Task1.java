package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse wh1 = new Warehouse();
        Worker picker1 = new Picker(wh1);
        Worker courier1 = new Courier(wh1);

        businessProcess(picker1);
        businessProcess(courier1);

        System.out.println(picker1);
        System.out.println(courier1);

        Warehouse wh2 = new Warehouse();
        Worker picker2 = new Picker(wh2);
        Worker courier2 = new Courier(wh2);

        picker2.doWork();
        courier2.doWork();

        System.out.println(picker1);
        System.out.println(courier1);
        System.out.println(picker2);
        System.out.println(courier2);
    }

    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();

        }
        worker.bonus();
    }
}
