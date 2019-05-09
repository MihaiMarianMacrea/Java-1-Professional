import java.util.*;

public class Exemplu4 {
    public static void main(String [] args) {
        List<Carte> carti = getCarti();
        carti.stream()// afisam cartile care au costat mai mult de 70 lei , primele 3
             .filter(carte -> carte.pret > 70)
             .limit(3)
             .forEach(carte -> System.out.println(carte));
    }
    
    public static List<Carte> getCarti() {
        return Arrays.asList(
               new Carte("Games of Thrones", "Martin",500, 100 ), 
               new Carte("Harry Potter", "Rowling",300, 60 ), 
               new Carte("Divina comedie", "Aligheri",400, 86 ),
               new Carte("Incepe cu de ce", "Sinek",240, 75 ),
               new Carte("Batranul si marea", "Hemingway",100, 25 )
        );
    }
}