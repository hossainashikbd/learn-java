package SixthClass;

import java.security.SecureRandom;

public class RandomPasswordGenerator {

    public static void main(String[] args) {
        System.out.println(generatePassword(8));
    }

    public static String generatePassword(int length) {
        // Define character sets
        String upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseChars = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String specialChars = "@#$%^&+=!";

        String allChars = upperCaseChars + lowerCaseChars + digits + specialChars;
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        password.append(upperCaseChars.charAt(random.nextInt(upperCaseChars.length())));
        password.append(lowerCaseChars.charAt(random.nextInt(lowerCaseChars.length())));
        password.append(digits.charAt(random.nextInt(digits.length())));
        password.append(specialChars.charAt(random.nextInt(specialChars.length())));

        for (int i = password.length(); i < length; i++) {
            password.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        for (int i = 0; i < password.length(); i++) {
            int j = random.nextInt(password.length());
            char temp = password.charAt(i);
            password.setCharAt(i, password.charAt(j));
            password.setCharAt(j, temp);
        }
        return password.toString();
    }
}
