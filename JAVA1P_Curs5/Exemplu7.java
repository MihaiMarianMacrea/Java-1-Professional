import java.util.concurrent.*;

public class Exemplu7{
    public static void main(String [] args){
        ExecutorService executor =  Executors.newSingleThreadExecutor();
        executor.execute(new MyRunnable());
    }
}