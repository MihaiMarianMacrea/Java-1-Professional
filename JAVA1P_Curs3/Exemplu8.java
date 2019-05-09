import java.time.*;

public class Exemplu8 {
    /*
     java.util.Date - @Deprecated
     
     java.time
     
        LocalDate      definim data si timpul in zona locala, An, Luna, Zi      Eroare dk nu scriu bine:DateTimeException
        LocalTime
        LocalDateTime
        ZonedDateTime    definim data si timpul pe o anumita zona , clasa zoneid
        
        Instant
        Period   pentru date 
        Duration  pentru time, period of time
     */
    public static void main(String [] args) {
        LocalDate ld1 = LocalDate.of(2019, 3, 6);
        System.out.println("ld2 = " + ld1);
        
        LocalDate ld2 = LocalDate.now();
        System.out.println("ld2 = "+ ld2);
        
        // LocalDate ld3 = LocalDate.of(2019,13, 6);
        // System.out.println("ld3 = "+ ld3);
        
        LocalDate ld4 = LocalDate.of(2019, Month.MARCH, 6);
        System.out.println("ld4 = "+ ld4);
        
        LocalTime lt1 = LocalTime.now();
        System.out.println("lt1 = "+ lt1);
        
        LocalTime lt2 = LocalTime.of(7, 45);
        System.out.println("lt2 = "+ lt2);
        
        LocalTime lt3 = LocalTime.of(7, 45, 36);
        System.out.println("lt3 = "+ lt3);
        
        LocalDateTime ldt1 = LocalDateTime.now();
        System.out.println("ldt1 = "+ ldt1);
        
        LocalDateTime ldt2 = LocalDateTime.of(ld1,lt3); // preferabil asa pentru a nu avea multi parametrii dati
        System.out.println("ldt2 = "+ ldt2);
        
    }
}