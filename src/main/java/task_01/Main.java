package task_01;

public class Main {
    public static void main(String[] args) {

        Bee workerBee = new Bee("Kolin", 3, "Worker");
        System.out.println(workerBee);
        workerBee.buzz();
        workerBee.collectHoney();

        workerBee.setAge(3);
        System.out.println("Age after one year: " + workerBee.getAge());

        workerBee.setRole("Guard");
        System.out.println("New role: " + workerBee.getRole());
        System.out.println(workerBee);
        System.out.println("--------------");

        Bee workerBee2 = new Bee("Anton",2,"Worker");
        workerBee2.collectHoney();
        System.out.println(workerBee2);

        Bee workerBee3 = new Bee("Jake",1,"Worker");
        workerBee2.collectHoney();
        System.out.println(workerBee2);

        
    }
}
