package FifthClass;

public class RandomCharacter {
    // Method to get a random character in a given range
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    // Method to get a random lowercase letter
    public static char getRandomLowerCaseLetter() {
        return getRandomCharacter('a', 'z');
    }

    // Method to get a random uppercase letter
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A', 'Z');
    }

    // Method to get a random digit character
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0', '9');
    }

    // Method to get a random character from the entire Unicode range
    public static char getRandomUnicodeCharacter() {
        return getRandomCharacter('\u0000', '\uFFFF');
    }
}
