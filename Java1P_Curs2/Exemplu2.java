import java.io.*;
public class Exemplu2 {
    public static void main(String [] args){
        //creare fisier
        File file = new File("A/test.txt");
        try{file.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}