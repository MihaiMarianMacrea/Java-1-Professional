import java.util.*;

public class Exemplu7 {
    public static void main(String [] args) { // cate carti sunt cu nrPagini >300
           List<Carte> carti = Exemplu4.getCarti();
           long nrCarti = 
                carti.stream()
                     .filter(carte -> carte.nrPagini > 300)
                     .count();
           System.out.println("Nr carti : " + nrCarti);          
        
    }
}