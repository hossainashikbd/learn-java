package FourClass;

public class ClassTest {
    public static void main(String[] args) {
        int total_sum = 0;

        for (int i = 3; i <= 1000; i+=3) {
            total_sum += i;
        }
        System.out.println("The result is: " + total_sum);
    }
}
