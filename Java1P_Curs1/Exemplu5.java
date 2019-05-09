import java.io.*;
import java.util.*;

public class Exemplu5 {
    /*
     * Se citeste din consola un numar intreg nr.
     * Se citeste din consola un nume de fisier.
     * Se scrie in fisierul cu numele dat din consola 
     * nr numere intregi aleatoare, fiecare pe o linie separata.
     */
    public static void main(String [] args){
        
        

        try {
            InputStreamReader reader = new InputStreamReader(System.in); // citim din consola
            BufferedReader in = new BufferedReader(reader);
            
            int nr = Integer.parseInt(in.readLine());
            String fileName = in.readLine(); // numele de fisier
            PrintStream out = null;
            try {
             out = new PrintStream(fileName);
            
            Random r = new Random();
            for(int i = 0; i<nr; i++){
                out.println(r.nextInt(100));
            }
           } catch(IOException e) {
            
           }finally {
               out.close();
           }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}

