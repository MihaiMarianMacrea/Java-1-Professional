import java.nio.file.*;
import java.io.*;

public class Exemplu15 {
    public static void main(String [] args){
        Path path = Paths.get("B");

        try{
            Files.list(path)
                 .forEach(p -> System.out.println(p));
        }catch(IOException e){
            e.printStackTrace();
        }
        //walk(path p, int level)
        
        //find()
    }
}
