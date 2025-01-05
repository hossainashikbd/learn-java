package ClassWorkJanuary2;

import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class CurrentTimeInAllTimeZones {
    public static void main(String[] args) {

        Set<String> allZones = ZoneId.getAvailableZoneIds();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        for (String zone : allZones) {
            ZonedDateTime currentTime = ZonedDateTime.now(ZoneId.of(zone));
            System.out.println("Time in " + zone + ": " + currentTime.format(formatter));
        }
    }
}
