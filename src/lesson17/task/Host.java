package lesson17.task;

public class Host {
    public static void main(String[] args) {
        System.out.println("Концерт начался");
        Singer1 singer1 = new Singer1();
        singer1.start();

        Singer2 singer2 = new Singer2();
        singer2.setDaemon(true);
        singer2.start();
        while (singer1.isAlive()){};
        System.out.println("Концерт окончен");
    }

}
