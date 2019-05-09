import java.util.concurrent.*;

public class RecursiveSum extends RecursiveTask<Long>{
    private int start;
    private int end;
    
    public RecursiveSum (int start, int end) {
        this.start = start;
        this.end = end;
    }
        
    @Override
    public Long compute(){
        if(end-start < 500){
         // task ce poate fi executat de un singur thread
         long sum = 0;
         for(int i = start; i <= end; i++){
             sum += i;
            }
            System.out.println("S-a facut suma de la " + start +" la " + end +" : " +
            sum);
            return sum;
        }else{
        // task ce nu poate fi executat de un singur thread
        // si trebuie separat cu mai multe taskuri
        int middle = (start + end) / 2;
        
        // task ce insumeaza numere de la strat la middle 
        System.out.println("Se va face suma de la "+ start + " la" + middle);
        RecursiveSum sumPart1 = new RecursiveSum(start, middle);
        
        sumPart1.fork(); // adica se bifurca pe alte fire de executie
        
        // task ce insumeaza numere de la middle+1 la end
        
        System.out.println("Se va face suma de la "+ (middle + 1) + " la" + end);
        
        RecursiveSum sumPart2 =  new RecursiveSum(middle+1, end);
        long resultedSumPart2 = sumPart2.compute();
        
        return sumPart1.join() + resultedSumPart2; // returneaza suma tuturor taskurilor returnate anterior
        }
       
    }
    
}
