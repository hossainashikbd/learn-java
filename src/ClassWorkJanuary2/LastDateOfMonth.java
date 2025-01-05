package ClassWorkJanuary2;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class LastDateOfMonth {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
        String formattedDate = dateFormat.format(cal.getTime());

        System.out.println("Last date of the month: " + formattedDate);
    }
}
