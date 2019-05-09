import java.nio.file.*;
import java.io.*;

public class Exemplu9 {
    public static void main(String [] args){
        Path pathFolder = Paths.get("C");
        try{
            Files.createDirectory(pathFolder);
        }catch(IOException e){
            e.printStackTrace();
        }

        Path path = Paths.get("C/hello.txt");
        try{
            Files.createFile(path);
        }catch(IOException e){
            e.printStackTrace();
        }

        //stergere 
        try{
            Files.delete(path);
        }catch(IOException e){
            e.printStackTrace();        
        }
    }
}
