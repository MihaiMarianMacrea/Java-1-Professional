import java.util.concurrent.*;

public class Exemplu1{
    public static void main(String [] args){
        ForkJoinPool pool = new ForkJoinPool(); 
        pool.invoke(new RecursiveSum(1, 3000));
    }

}