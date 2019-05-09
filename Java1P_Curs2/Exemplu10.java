import java.nio.file.*;
import java.io.*;

public class Exemplu10 {
    public static void main(String [] args){
        Path path1 = Paths.get("Exemplu9.java");
        Path path2 = Paths.get("copy.txt");  // copiere fisier in alt path, care nu exista

        try{
            Files.copy(path1, path2, StandardCopyOption.REPLACE_EXISTING);// suprascriere fisier existent 
                                                                          //StandarCopyOption.REPLACE_EXISTING
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}