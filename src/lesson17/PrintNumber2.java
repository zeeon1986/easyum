package lesson17;

public class PrintNumber2 implements Runnable {


    @Override
    public void run() {
        System.out.println("третий поток начал работу");
        for (int i = 1000; i < 1020; i++) {
            System.out.println(i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("третий поток закончил работу");
        }
    }
}
