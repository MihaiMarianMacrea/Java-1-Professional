import java.io.*;

public class Exemplu4 {
    public static void main(String [] args) {
        
        try(FileInputStream fileStream = new FileInputStream("Exemplu1.java");
        InputStreamReader reader = new InputStreamReader (fileStream);
        BufferedReader in = new  BufferedReader(reader);
        PrintStream out = new PrintStream("test.txt")){
            String line= " ";
            while((line = in.readLine()) != null){
                    out.println(line);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}