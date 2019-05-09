import java.time.*;

public class Exemplu9 {
    public static void main(String [] args) {
        ZoneId.getAvailableZoneIds()
              .stream()
              .filter(zoneId -> zoneId.contains("Europe"))
              .forEach(System.out::println);
              
        ZonedDateTime zdt1 = ZonedDateTime.now();
        ZonedDateTime zdt2 = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println("now here: " + zdt1);
        System.out.println("now in Paris: " + zdt2);
    }
}