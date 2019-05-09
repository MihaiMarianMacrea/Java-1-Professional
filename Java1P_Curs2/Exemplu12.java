import java.nio.file.*;
import java.io.*;
import java.util.*;

public class Exemplu12 {
    public static void main(String [] args){
        Path path = Paths.get("Exemplu10.java");
               
        try{
            List<String> lines= Files.readAllLines(path); // folosesti pe fisiere cu maxim cateva sute de linii , mici
            lines.forEach(System.out::println);
            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}