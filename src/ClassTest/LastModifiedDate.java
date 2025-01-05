package ClassTest;

import java.io.File;
import java.text.SimpleDateFormat;

public class LastModifiedDate {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Java Student PC-11\\Desktop\\Java";

        File file = new File(filePath);


        if (file.exists()) {

            long lastModified = file.lastModified();


            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formattedDate = sdf.format(lastModified);


            System.out.println("Last Modified Date: " + formattedDate);
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
