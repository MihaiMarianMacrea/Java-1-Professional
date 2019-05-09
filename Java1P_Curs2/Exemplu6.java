import java.nio.file.*;

public class Exemplu6 {
    public static void main(String [] args) {
        Path path1 = Paths.get("C:/A/B/C/D/test.txt"); // absoluta
        Path path2 = Paths.get("E/F"); // relativa
        
        System.out.println(path1.getName(0));
        System.out.println(path1.getRoot());
        
        System.out.println(path2.getName(0));
        System.out.println(path2.getRoot());
        
        Path path3 =  path1.subpath(1, 3);
        System.out.println("path3 = " +path3);
        
        System.out.println("nr elemente = " +path1.getNameCount());
    
    
    }
}