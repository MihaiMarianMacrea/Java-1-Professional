import java.util.*;

public class Subject {
    private List<Listener> listeners = new  ArrayList<>();
    
    public void addListener(Listener l) {
        listeners.add(l);
    }
    
    public void removeListener(Listener l) {
        listeners.remove(l);
    }
    
    public void doSomething(){
        System.out.println("Subiectul meu face ceva.....");
        for(Listener l : listeners) {
            l.subiectModificat();
        }
    }
}