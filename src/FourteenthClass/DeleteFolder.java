package FourteenthClass;

import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        String folderPath = "C:\\Users\\Java Student PC-11\\Desktop\\kalam";

        File folder = new File(folderPath);

        if (folder.exists()) {

            if (folder.delete()) {
                System.out.println("Folder deleted successfully!");
            } else {
                System.out.println("Failed to delete the folder. It may not be empty.");
            }
        } else {
            System.out.println("The folder does not exist.");
        }
    }
}
