import java.io.*;
public class Exemplu3 {
    public static void main(String [] args){
        //stergere fisier sau folder(la folder doar daca este gol)
        File file = new File("A/test.txt");
        if(file.delete()){
            System.out.println("Fisierul a fost sters!");
        }
    }
}