import java.util.concurrent.*;

public class Exemplu1 {
    /*
       java.util.concurrent
       
       Executor 
       ExecutorService - mosteneste Executor, adauga met care iti mermit sa controlezi flow-ul executiei
                    shutdown, alte tipuri de taskuri in afara de Ruannable
       ScheduledExecutorService
       
       Executors (clasa) - utilitara, cu met statice de tip factory, 
                  
       */
    public static void main(String [] args){
        ExecutorService executor = Executors.newSingleThreadExecutor();
        try{executor.execute(() -> {
            for(int i=0; i<= 20 ; i+=2){
                System.out.println(i);
            }//primeste un task un runnable
        });
    } finally{
        executor.shutdown();
    }
    }
}