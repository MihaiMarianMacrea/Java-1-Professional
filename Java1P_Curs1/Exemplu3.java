import java.io.*;

public class Exemplu3 {
    public static void main(String [] args){
        try(FileInputStream fileStream = new FileInputStream("Exemplu1.java");
        InputStreamReader reader=  new InputStreamReader(fileStream);
        BufferedReader in= new BufferedReader(reader)){
            String line = " ";
            while(( line = in.readLine()) != null){
                System.out.println(line);
            }
            
        }catch(IOException e){
            
            }
    }
}