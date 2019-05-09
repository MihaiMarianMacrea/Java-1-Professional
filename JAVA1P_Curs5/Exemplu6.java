import java.util.*;

public class Exemplu6 {
    public static void main(String [] args) {
     List<Integer> list =  Arrays.asList(4, 5, 9, 7, 5, 2, 1, 6, 3,
                                        8, 10, 9, 0, 11, 18, 17);
     
     long startTime = System.currentTimeMillis();
     list.stream()
         .filter(n -> {
             try{
                 Thread.sleep(1000);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
                return n % 2 ==0;
            })
         .forEach(System.out::println);
         
     long endTime = System.currentTimeMillis();
     System.out.println("cu stream() a durat " + (endTime - startTime));
         
     
     
     startTime = System.currentTimeMillis();
     list.parallelStream()
         .filter(n -> {
             try{
                 Thread.sleep(1000);
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
                return n % 2 ==0;
            })
         .forEach(System.out::println);
         
     endTime = System.currentTimeMillis();
     System.out.println("cu parallelStream() a durat " + (endTime - startTime));
    }
}