public class CommitCafe {

    private static String barista = "Ilya Abbasian"; // STUDENT_TODO_1A
    private static String title = "[Lead Barista]"; // STUDENT_TODO_1B

    private static int cups = 0;

    public static void brew(String drink) {
        cups++;
        System.out.println(title + " " + barista + " brewed a cup of " + drink + ".");
    }

    public static void printSummary() {
        System.out.println("[SUMMARY] " + barista + " brewed " + cups + " cups today.");
    }

    public static void main(String[] args) {
        brew("Espresso");
        brew("Latte");
        printSummary();
    }
}