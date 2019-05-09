public class Exemplu5 {
    public static void main(String [] args) {
        Subject s = new Subject();
        s.addListener(new ListenerImpl());
        s.doSomething();
    }
}