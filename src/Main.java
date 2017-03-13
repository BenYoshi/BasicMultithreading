import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        runScenario();
    }

    private static void runScenario() {
        new Teacher();
        new Guard();
        for (int i = 0; i < 10; i++) {
            new Student(i, ThreadLocalRandom.current().nextLong(2000, 6000));
        }
    }
}
