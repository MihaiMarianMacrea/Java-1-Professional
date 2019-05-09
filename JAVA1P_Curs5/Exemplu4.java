import java.util.concurrent.*;

public class Exemplu4{
    public static void main(String [] args) {
        ScheduledExecutorService executor =  
                    Executors.newSingleThreadScheduledExecutor();
                    
        executor.scheduleAtFixedRate( // incepe dupa o anumia perioada de timp data 3sec, indiferent de cat dureaza taskul
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