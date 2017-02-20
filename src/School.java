/**
 * Created by Benny on 2/20/2017.
 */
public class School {

    private static int numberAtEntrance, numberInClassroom;
    private static boolean entranceOpen, classroomFull;

    public static void arriveAtEntrance() {
        numberAtEntrance++;
    }

    public static int getNumberAtEntrance() {
        return numberAtEntrance;
    }

    public static void openEntrance() {
        entranceOpen = true;
    }

    public static boolean isEntranceOpen() {
        return entranceOpen;
    }

    public static void arriveAtClassroom() {
        numberInClassroom++;
    }

    public static int getNumberInClassroom() {
        return numberInClassroom;
    }

    public static void openClassroom() {
        classroomFull = true;
    }

    public static boolean isClassroomFull() {
        return classroomFull;
    }
}
