/**
 * Created by Benny on 2/19/2017.
 */
public class Guard implements Runnable {

    public Guard() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (School.getNumberAtEntrance() < 10) {
            waitPatiently();
        }

        School.openEntrance();
        System.out.println("The guard has opened the door.");
    }

    private void waitPatiently() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
