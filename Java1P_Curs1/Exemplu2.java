import java.io.*;

public class Exemplu2 {
    
    public static void main(String [] args) {
        
        
        try(InputStreamReader reader = new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(reader);) {
            String line = in.readLine(); 
            System.out.println(new StringBuilder(line).reverse());
            
        }catch(IOException e){
        e.printStackTrace();
        }
    }
}