import java.util.concurrent.*;

public class Exemplu5{
    public static void main(String [] args) {
        ScheduledExecutorService executor =  
                    Executors.newSingleThreadScheduledExecutor();
                    
        executor.scheduleWithFixedDelay( // se executa dupa ce se termina primul task
            () -> {System.out.println(System.currentTimeMillis()); },
            3, // peste 3 sec
            2, // si apoi din 2 in 2 sec
            TimeUnit.SECONDS
        );
        
        try{
        Thread.sleep(10000);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
  }
}