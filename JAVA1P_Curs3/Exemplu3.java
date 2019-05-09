import java.util.stream.*;
import java.util.*;


public class Exemplu3 {
    /*
     jva.util.stream
     Stream<T>
     */
    public static void main(String [] args){
            Stream<Integer> s1 = Stream.empty();
            Stream<Integer> s2 = Stream.of(4, 7, 10, 2, 5);//sau (4) sau oricati param
            Stream<Integer> s3 = Stream.iterate(1, x -> x + 5 ); 
            //primul element e 1 al 2 lea este f(1), al treilea este f(f(1))
    
            s3.limit(10)   // operatie intermediara
              . forEach(nr -> System.out.println(nr)); // operatie terminala , acum incepe sa execute 
              // forEach primeste ca parametru un Consumer 
              
            System.out.println("-------------------------------------");
            Stream<Integer> s4 = Stream.generate(
                    () -> new Random().nextInt(1000));
              
            s4.limit(15)
              .forEach(System.out::println);
    } 
}