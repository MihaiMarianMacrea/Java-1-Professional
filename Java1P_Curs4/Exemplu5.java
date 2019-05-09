import java.util.*;
import java.util.stream.*;

public class Exemplu5 {
    public static void main(String [] args){
        /*
           Se da lista de produse
           Sa se obtina o lista cu primele 3 cele mai mici preturi
           
           */
        
        List<Produs> lista = Produs.getProduse();
        List<Double> rezultat = 
        lista.stream()
             .map(produs -> produs.pret)
             .sorted()
             .limit(3)
             .collect(Collectors.toList());
     
        rezultat.forEach(System.out::println);     
        
    }
}