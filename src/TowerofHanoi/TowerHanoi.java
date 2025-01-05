package TowerofHanoi;

public class TowerHanoi {

    public static void solveTowerOfHanoi(int n, String source, String auxiliary, String destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        solveTowerOfHanoi(n - 1, source, destination, auxiliary);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        solveTowerOfHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 3;
        String source = "A";
        String auxiliary = "B";
        String destination = "C";

        System.out.println("The moves to solve Tower of Hanoi with " + n + " disks are:");
        solveTowerOfHanoi(n, source, auxiliary, destination);
    }
}
