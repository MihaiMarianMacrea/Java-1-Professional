import java.util.*;
import java.util.concurrent.*;

public class Exemplu3{
    public static void main(String [] args) {
        //ExecutorService executor = Executors.newFixedThreadPool(7); //7 fire de executie
        ExecutorService executor = Executors.newCachedThreadPool();// calculeaz singur de cate fire de executie are nevoie
        
        SumCallable callable1 = new SumCallable( 
                                Arrays.asList(1, 5, 4, 7 ,8 ,3));
        SumCallable callable2 = new SumCallable( 
                                Arrays.asList(2, 3, 9, 8 ,6 ,1));
        SumCallable callable3 = new SumCallable( 
                                Arrays.asList(4, 2, 3, 5 ,9 ,7));
                                
        Future<Integer> rez1 = executor.submit(callable1); 
        Future<Integer> rez2 = executor.submit(callable2);  
        Future<Integer> rez3 = executor.submit(callable3);  
        
        try{
            System.out.println("suma 1 = " + rez1.get());
            System.out.println("suma 2 = " + rez2.get());
            System.out.println("suma 3 = " + rez3.get());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}