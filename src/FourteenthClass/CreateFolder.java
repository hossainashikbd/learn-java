package FourteenthClass;

import java.io.File;

public class CreateFolder {
    public static void main(String[] args) {
        // Specify the folder path including parent directories
        String folderPath = "C:\\Users\\Java Student PC-11\\Desktop\\kalam";

        // Create File object
        File folder = new File(folderPath);

        // Check if the folder already exists
        if (folder.exists()) {
            System.out.println("The folder already exists.");
        } else {
            // Create the folder, including parent directories if needed
            if (folder.mkdirs()) {
                System.out.println("Folders created successfully!");
            } else {
                System.out.println("Failed to create the folders. Check permissions or path.");
            }
        }
    }
}
