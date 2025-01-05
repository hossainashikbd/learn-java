package ClassTest;

import java.io.File;

public class FileSizeConverter {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Java Student PC-11\\Desktop\\Java";


        File file = new File(filePath);


        if (file.exists()) {

            long fileSizeInBytes = file.length();


            double fileSizeInKB = fileSizeInBytes / 1024.0;
            double fileSizeInMB = fileSizeInKB / 1024.0;


            System.out.println("File Size:");
            System.out.println("Bytes: " + fileSizeInBytes + " B");
            System.out.println("Kilobytes: " + String.format("%.2f", fileSizeInKB) + " KB");
            System.out.println("Megabytes: " + String.format("%.2f", fileSizeInMB) + " MB");
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
