import java.util.*;

public class Exemplu2{
    
    /*
     * ResurceBundle
     * Este fol pentru a traduce o aplicatie in mai multe limbi
     * se pot folosi doua variante clase java sau fisier de proprietati(cel mai fol)
     */
    public static void main(String [] args){
        Locale loc1 = new Locale("ro", "RO");
        Locale loc2 = new Locale("fr", "FR");
        ResourceBundle res = ResourceBundle.getBundle("translations", loc1);// pt locala default ("translations");
        
        System.out.println(res.getString("btnAdd"));
        
        ResourceBundle res2 = ResourceBundle.getBundle("translations", loc2);
        System.out.println(res2.getString("btnAdd"));
    }
}