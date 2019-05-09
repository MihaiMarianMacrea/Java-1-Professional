import java.util.*;
import java.util.concurrent.*;

public class Exemplu2{
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1, 5, 7, 2, 3, 9, 6);
        SumCallable callable = new SumCallable(list);
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> rezultat = executor.submit(callable); // submit primeste si runnable si callable
        //... aici pot sa mai fac si alte operatii
        try{
        int suma = rezultat.get();
        System.out.println("suma = " + suma);
    }catch(InterruptedException | ExecutionException e){
        System.out.println(e.getMessage());
    }finally{
        executor.shutdown();
       }
    }

}