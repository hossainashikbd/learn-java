import java.util.Objects;
import java.util.Scanner;

public class Exception {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = input.nextLine();
        System.out.print("Enter password: ");
        String password = input.nextLine();

        try {
            validateUsername(username);
            validatePassword(password);
            System.out.println("|>>   Welcome, " + username + "   |");
        } catch (CustomException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            input.close();
        }
    }

    private static void validateUsername(String username) {
        String actualUsername = "Ashik";
        if (!Objects.equals(username, actualUsername)) {
            throw new CustomException("Incorrect username!");
        }
    }

    private static void validatePassword(String password) {
        String actualPassword = "IloveYou143";
        if (!Objects.equals(password, actualPassword)) {
            throw new CustomException("Incorrect password!");
        }
    }

    public static class CustomException extends RuntimeException {
        public CustomException(String message) {
            super(message);
        }
    }
}
