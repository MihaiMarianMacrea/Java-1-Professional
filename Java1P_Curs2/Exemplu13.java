
import java.util.*;

public class Exemplu13 {
    
    /*
     *Streams API
     */
    public static void main(String [] args){
        List <String> words = Arrays.asList("blue","red", "green", "yellow", "white", "black");
        
        words.stream()
             .filter(word -> word.length()>4) // instanta de Predicate, operatie intermediara
             .forEach(word -> System.out.println(word)); // metoda finala
    }
}
