import java.util.*;
import java.util.stream.*;

public class Exemplu6{
    
    /*
       Se da lista de produse.
       Sa se obtina media pretul mediu al produselor din categoria birotica
       */
    public static void main(String [] args){
        List<Produs> lista = Produs.getProduse();
        double rezultat = lista.stream()
             .filter(produs -> produs.categorie.equals("birotica"))
             .collect(Collectors.averagingDouble(produs -> produs.pret));
             
    System.out.println("Pretul mediu din birotica este egal cu: " + rezultat);      
    System.out.println(lista);         
    
    }
}