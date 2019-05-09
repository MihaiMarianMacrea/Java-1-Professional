import java.nio.file.*;
import java.io.*;

public class Exemplu14 {
    public static void main(String [] args){
        Path path = Paths.get("Exemplu13.java");

        try{
            Files.lines(path)
                 .filter(line -> !line.startsWith("p")) //filtram liniile care nu incep cu p
                 .forEach(line ->System.out.println(line));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
