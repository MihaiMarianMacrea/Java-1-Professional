import java.util.*;

public class Produs{
    String nume;
    double pret;
    String categorie;
    double greutate;
    int stoc;
    
    public Produs(String nume, double pret, String categorie, double greutate, int stoc){
        this.nume = nume;
        this.pret = pret;
        this.categorie = categorie;
        this.greutate = greutate;
        this.stoc = stoc;
    }
    
    public String toString(){
        return nume + " / "+ pret+" lei "+categorie+" / "+greutate + " grame " + stoc +" buc";
    }
    
    
    public static List<Produs> getProduse(){
        return Arrays.asList(
            new Produs ("laptop", 2500, "IT", 1400, 10), 
            new Produs ("camera foto", 1700, "electronice", 800, 7),
            new Produs ("mause", 160, "IT", 60, 3),
            new Produs ("pix", 2, "birotica", 10, 25),
            new Produs ("creion", 1.5, "birotica", 7, 14),
            new Produs ("marker", 4.5, "birotica", 20, 7)
        );
    }
}