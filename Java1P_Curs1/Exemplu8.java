import java.io.*;
public class Exemplu8{
    public static void main(String [] args) {
        C c = new C();
    
        
        try(FileOutputStream fileStream = new FileOutputStream("testC");
        ObjectOutputStream out = new ObjectOutputStream(fileStream)){
            out.writeObject(c);
        }catch(IOException e){
            e.printStackTrace();
        }
        
        try(FileInputStream fileStream = new FileInputStream("testC");
        ObjectInputStream in = new ObjectInputStream (fileStream)){
        C c2 = (C)in.readObject(); 
        //System.out.println(c2);
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}