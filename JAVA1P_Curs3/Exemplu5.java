import java.util.*;

public class Exemplu5 {
    /*
     Stream<T> 
     IntStream          restul primitive
     LongStream
     DoubleStream
     
     Stream--> map() --> Stream
     Stream --> mapToDouble() --> DoubleStream
     Stream --> mapToInt() --> IntStream
     Stream --> mapToLong() --> LongStream
     
     IntTream , LongStream, DoubleStream --> mapToObject() --> Stream
     */
    public static void main (String [] args) {
        // vreau sa vad valoare totala a cartilor din biblioteca mea
        List<Carte> carti = Exemplu4.getCarti();
        double  valoareTotala = carti.stream()   
             // aici putem face si filtrare dk vrem
             .mapToDouble(carte -> carte.pret)
             .sum();
              System.out.println("Valoare toala carti :" + valoareTotala+ " lei");
             
        double valoareTotala2 = 
                            carti.stream()
                                     .map(carte -> carte.pret)
                                     .reduce(0.0,(pret1, pret2) -> pret1 +pret2 );// doi parametrii, primul este valoarea initiala (0 in cazul nostru) , urmatorul param este o functie cu 
                                                                                  // doi param , pornind de la 0,
        System.out.println("Valoare toala carti :" + valoareTotala2+ " lei");

        
    }
}