import java.nio.file.*;
import java.io.*;

public class Exemplu11 {
    public static void main(String [] args){
        Path path = Paths.get("Exemplu10.java");

        try(BufferedReader reader = Files.newBufferedReader(path)){
            String line = "";
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
