/**
 * Created by Benny on 2/19/2017.
 */
public class Teacher implements Runnable {

    public Teacher() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        openClassroomDoor();
    }

    public void openClassroomDoor() {
        while (School.getNumberInClassroom() < 10) {
            waitPatiently();
        }

        School.openClassroom();
        System.out.println("The teacher has opened the door and begun the quiz.");
    }

    private void waitPatiently() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
