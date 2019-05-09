import java.util.concurrent.*;

public class MyRunnable implements Runnable{
    int n;
    static Semaphore semaphore = new Semaphore(2);// 1 - sinonim syncronize 
    //2 - boolean, fair(primul venit primul servit) sau nonfair(ia orice proces din coada),by default este nonfair  

    @Override
    public void run(){
        for (int i = 0; i < 20; i++){
            try{
                semaphore.acquire();
                n++;
                System.out.println("n = " + n);
                
            }catch(Exception e){
                System.out.println(e.getMessage());
            }finally{
                semaphore.release();
            }
        }
    }
}