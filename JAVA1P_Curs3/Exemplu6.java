import java.util.*;

public class Exemplu6 {
    public static void main(String [] args){ 
        // vrem sa verificam daca toate cartile au autor
        List<Carte> carti = Exemplu4.getCarti();
        boolean rezultat = 
        carti.stream()
             .allMatch( carte -> carte.autor != null &&
                                 !carte.autor.isEmpty());  // toate se potrivesc cu un criteriu
        System.out.println("Toate cartile au autor definit : " + rezultat);
        // toate met sunt scurcircuitate, adica daca ajunge la un element care returneaza false la conditia asta s-a intors streamul 
        
        boolean rezultat2 =
             carti.stream()
             .anyMatch(carte -> carte.pret < 60);
        System.out.println("Exista notat o carte cu pretul mai mic de 60 lei : " + rezultat2);
    }

}