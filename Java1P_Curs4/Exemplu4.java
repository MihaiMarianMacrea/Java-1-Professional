import java.util.*;
import java.util.stream.*;
/*
   Se da o lista de produse
   Sa se obtina un Map format din numele produsului si stocul acestuia
   */
public class Exemplu4{
    public static void main(String [] args){
        List<Produs> lista = Produs.getProduse();
        Map<String, Integer> rezultat = 
         lista.stream()
             .collect(Collectors.toMap(produs ->produs.nume, 
                                      produs ->  produs.stoc));
                                      
        System.out.println(rezultat);
    }

}