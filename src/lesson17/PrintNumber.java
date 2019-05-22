package lesson17;

public class PrintNumber extends Thread {
    @Override
    public void run() {
        System.out.println("второй поток начал работу");
        for (int i = 10000; i < 10020; i++) {
            System.out.println(i);
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (i == 10010) {
                Thread thread2 = new Thread(new PrintNumber2());
                thread2.start();
            }
            System.out.println("второй поток закончил работу");
        }
    }
}
