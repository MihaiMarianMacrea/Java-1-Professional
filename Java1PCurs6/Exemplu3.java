public class Exemplu3 {
    public static void main(String [] args) {
        FluxHighLevel flux = new FluxHighLevel(new FluxLowLevel());
        flux.read();
    }
}