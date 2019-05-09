import java.io.*;

public class Exemplu7 {
    public static void main(String [] args){
        try(FileInputStream fileStream = new FileInputStream("masina");
        ObjectInputStream in = new ObjectInputStream (fileStream)){
        Masina masina = (Masina)in.readObject(); 
        System.out.println(masina);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    
    }
}