import java.util.*;
import java.util.stream.*;
/*
   Se da o lista de produse
   Sa se obtina nr de produse per categorie.
   */
public class Exemplu8{
    public static void main(String [] args){
        List<Produs> lista = Produs.getProduse();
        Map<String, Long> rezultat =
        lista.stream()
             .collect(Collectors.groupingBy(
                                 produs -> produs.categorie, 
                                 Collectors.counting()));
                                 
                             
        for(String categorie: rezultat.keySet()){
            System.out.println("key: "+ categorie +" value: " + rezultat.get(categorie));  
                        
        }
      
    
}

}