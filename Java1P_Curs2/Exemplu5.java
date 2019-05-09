import java.nio.file.*;

public class Exemplu5 {
/*
  java.nio.file   din java 7 in sus
  Path - interfata
  Paths - clasa utilitara, ce ne ajuta sa folosim instante de Path pentru a ne da Path -ul
           in functie de sistemul de  operare
  Files -clasa utilitara,
 */        
public static void main(String [] args) {
    Path path1 = Paths.get("C:/A/B/C/test.txt"); // absoluta
    Path path2 = Paths.get("A/B/C"); // relativa
    
    System.out.println(path1.getClass());
    
  }
}