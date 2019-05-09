import java.nio.file.*;

public class Exemplu8 {
    public static void main(String [] args){
        Path path1 =  Paths.get("A/B/C/D");
        Path path2 =  Paths.get("A/B/X/Y");
        
        Path path3 = path1.relativize(path2); // calea relativa de la un punct la altul, merge doar daca
            //ambele sunt relative sau ambele sunt absolute
        System.out.println("path3 = " + path3);
        
        Path path4 = Paths.get("A/B/./../.././C/D");
        System.out.println( path4.normalize());
    }
}
