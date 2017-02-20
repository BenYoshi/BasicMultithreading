/**
 * Created by Benny on 2/19/2017.
 */
public class Student implements Runnable {
    private int id;
    private long threadSpeed;


    public Student(int id, long threadSpeed) {
        this.id = id;
        this.threadSpeed = threadSpeed;

        new Thread(this).start();
    }

    @Override
    public void run() {
        goToSchool();
        goToClassroom();
        takeQuiz();
    }

    private void goToSchool() {
        System.out.println("Student " + id + " is waking up and going to school.");

        go();

        System.out.println("Student " + id + " is waiting by the school entrance.");

        School.arriveAtEntrance();

        while (!School.isEntranceOpen()) {
            waitPatiently();
        }
    }

    private void goToClassroom() {
        go();

        System.out.println("Student " + id + " is waiting by the classroom door.");

        School.arriveAtClassroom();

        while (!School.isClassroomFull()) {
            waitPatiently();
        }
    }

    private void takeQuiz() {
        go();

        System.out.println("Student " + id + " has finished the quiz and left.");
    }

    private void go() {
        try {
            Thread.sleep(threadSpeed);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void waitPatiently() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
