import java.util.*;
import java.util.stream.*;
/*
   Dorim o lista cu toate limbajele de programare pe care le stiu programatorii
   */
public class Exemplu10{
    public static void main(String [] args){
        Programator p1 = new Programator("Gigel",
                             Arrays.asList("Java", "Pyton"));
        Programator p2 = new Programator("Costel",
                             Arrays.asList("C#", "JavaScript"));
                             
        List<Programator> lista =  new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        
        List<String> rezultat =
        lista.stream()
             .map(programator -> programator.limbaje)
             .flatMap(limbaje -> limbaje.stream())
             .collect(Collectors.toList());
        
        rezultat.forEach(System.out::println);
    }

}