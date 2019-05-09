import java.util.*;
import java.util.stream.*;
/*
   Se da o lista de produse
   Sa se obtina produsele grupate per categorie.
   */
public class Exemplu7{
    public static void main(String [] args){
        List<Produs> lista = Produs.getProduse();
        Map<String, List<Produs>> rezultat =
        lista.stream()
             .collect(Collectors.groupingBy(
                                 produs -> produs.categorie));
                                 
        //System.out.println(rezultat);                         
        for(String categorie: rezultat.keySet()){
            System.out.println("key: "+ categorie);  
            System.out.print("value: ");  
                  rezultat.get(categorie)
                         .forEach(produs -> System.out.print(produs.nume +", "));
            System.out.println("");             
        }
      
    
}

}