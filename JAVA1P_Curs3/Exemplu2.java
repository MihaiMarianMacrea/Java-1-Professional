import java.util.function.*;

public class Exemplu2 {
    /*
     java.util.function
        Consumer<T> , o singura met accept
        BiConsumer<T, U>  met apply , prelucreaza doua date 
        Supplier<T> , furnizeaza ceva, met get, nu are parametru
        Predicate<T> , testeaza o conditie logica returneaza boolean, 
        BiPredicate<T, U> , aplica o conditie logica pe ambii parametrii si returneaza true/false
        Function<T,U>, met apply, un singur parametru T
        BiFunction<T, U, V> primeste 2 parametri, apply si returneaza alt tip
        UnarayOperator<T>, specializare de Funciton, in care cele doua tipuri generice sunt acelasi
        BinaryOperator<T> , dai doi parametrii cu acelasi tip generic, specializare de BiFunction
     */
    public static void main(String [] args){
        Consumer<Integer> c1 = x-> System.out.println(Math.sqrt(x));
        
        c1.accept(100);
        
        BiConsumer<Integer, Integer> c2 = 
            (x, y) -> System.out.println(x*y);
        
        c2.accept(5, 1400);
        
        Function<String, Integer> f1 = x -> x.length();
        System.out.println(f1.apply("Hello world!"));
        
        UnaryOperator<Integer> up1 = x -> (int) Math.pow(x, 2);
        System.out.println(up1.apply(7));
        
    }
}