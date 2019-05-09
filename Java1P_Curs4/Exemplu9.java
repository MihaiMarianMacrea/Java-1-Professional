import java.util.*;
import java.util.stream.*;
/*
   Se da o lista de produse 
   Sa se obtina produsele grupate dupa urmatorul criteriu:
   pret > sau pret <=10
   */

public class Exemplu9{
    public static void main(String [] args){
        List<Produs> lista = Produs.getProduse();
        Map<Boolean, List<Produs>> rezultata =
        lista.stream()
             .collect(Collectors.partitioningBy(produs -> produs.pret >10));
        
        System.out.println(rezultata);     
    }
}