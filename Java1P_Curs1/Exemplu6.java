import java.io.*;

public class Exemplu6 {
    public static void main(String [] args){
        Masina masina= new Masina("Dacia", 1996, false, 500.6);

        try(FileOutputStream fileStream = new FileOutputStream("masina");
        ObjectOutputStream out = new ObjectOutputStream(fileStream)){
            out.writeObject(masina);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}