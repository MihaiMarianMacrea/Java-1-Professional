import java.nio.file.*;

public class Exemplu7 {
    public static void main(String [] args){
        Path path1 =  Paths.get("C:/A/B/C");
        Path path2 =  Paths.get("F/G/H");
        
        Path path3 = path1.resolve(path2); // cocateneaza cai
        System.out.println("path3 = " + path3);
    }
}