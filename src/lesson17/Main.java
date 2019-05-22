package lesson17;

public class Main {
    public static void main(String[] args) {
        System.out.println("первый поток начал работу");

        PrintNumber pn = new PrintNumber();
        pn.start();
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Первый поток закончил работу");
    }
}
