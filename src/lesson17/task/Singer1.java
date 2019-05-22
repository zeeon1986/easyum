package lesson17.task;

public class Singer1 extends Thread {
    private boolean isRun = true;

    @Override
    public void run() {
        int count = 0;
        while (isRun) {
            for (int i = 0; i < 3; i++) {
                System.out.println("--La--");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (Monitors.microphone) {
                Monitors.microphone.notify();
            }
            synchronized (Monitors.microphone) {
                try {
                    Monitors.microphone.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count++;
            if (count > 3) {
                isRun = false;
            }
        }
    }
}
