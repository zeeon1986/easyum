package lesson17.task;

public class Singer2 extends Thread {
    private boolean isRun = true;

    @Override
    public void run() {
        int count = 0;
        while (isRun) {
            synchronized (Monitors.microphone) {
                try {
                    Monitors.microphone.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 3; i++) {
                    System.out.println("++La++");
                    try {
                        Thread.sleep(400);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                synchronized (Monitors.microphone) {
                    Monitors.microphone.notify();
                }
            }
        }
    }
}
