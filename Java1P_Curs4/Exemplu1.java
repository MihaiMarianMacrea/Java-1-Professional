import java.util.*;

public class Exemplu1{
    /*
      java.util.locale
     */
    
    public static void main(String [] args){
        Locale loc1 = Locale.getDefault(); // setarile de pe masina curenta
        System.out.println("default locale: " + loc1 );
        
        // cu constructor
        Locale loc2 = new Locale("ro", "RO");// puteam sa ii dam doar limba, limba si tara, limba -tara si un 
        System.out.println("default locale: " + loc2 );
        
        
        Locale loc3 = new Locale("fr");
        System.out.println("default locale: " + loc3 );
        
        // folosind un Builder
        Locale loc4 = new Locale.Builder()
                                .setLanguage("es")
                                .setRegion("ES")
                                .build();
        System.out.println("default locale: " + loc4 );
        
        //sau, pentru tarile mai cunoscute
        Locale loc5 = Locale.GERMANY;
        System.out.println("default locale: " + loc5 );
        
    }
}