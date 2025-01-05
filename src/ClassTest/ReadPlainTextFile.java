package ClassTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadPlainTextFile {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Java Student PC-11\\Desktop\\Java\\example.txt";

        // Check if file exists
        File file = new File(filePath);
        if (!file.exists() || file.isDirectory()) {
            System.out.println("File not found or is a directory: " + filePath);
            return;
        }

        // Read the file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
