import java.util.function.*;

public class Exemplu1 {
    public static void main(String [] args){
        Predicate<String> p1= (String s) -> { 
            return s.length() >10;
        };
        
        boolean rezultat = p1.test("hello");
        System.out.println("rezultat = " + rezultat);
        
        Predicate<String> p2 = s-> s.contains("a");  // daca implementare metodei are o singura instructiune nu mai pun{}
        boolean rezultat2 = p2.test("Hello, Ana!");
        System.out.println("rezultat = " + rezultat2);
        
    }
}