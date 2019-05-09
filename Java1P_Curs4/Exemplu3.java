import java.util.*;
import java.util.stream.*;
/*
 Se da o lista de produse.
 Sa se obtina o lista cu categoriile disctincte ale produselor din lista
 */
public class Exemplu3{
    public static void main(String [] args){
      List<Produs> lista =Produs.getProduse();
      List<String> rezultat = 
      lista.stream()
           .map(produs -> produs.categorie) //f(x) = y
           .distinct()
           .collect(Collectors.toList()); // coleacteaza elem din acest stream , folosind Collectors transformand in List
           
    rezultat.forEach(System.out::println);
      
      // pentru o anumita implementare de list
      ArrayList<String> rezultat2 = 
      lista.stream()
           .map(produs -> produs.categorie) 
           .distinct()
           .collect(Collectors.toCollection(ArrayList::new)); 
      
    rezultat2.forEach(System.out::println);
    
    Set<String> rezultat3 = 
        lista.stream()
             .map(produs -> produs.categorie)
             .collect(Collectors.toSet());
             
    rezultat3.forEach(System.out::println);      
    
    
    }

}