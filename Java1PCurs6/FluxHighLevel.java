public class FluxHighLevel {
    FluxLowLevel fluxLowLevel;
    //Decorator design pattern
    // composition over inheritance
    public FluxHighLevel(FluxLowLevel fluxLowLevel) {
        this.fluxLowLevel = fluxLowLevel;
    }
    
    public void read() {
        fluxLowLevel.read();
        System.out.println("Transformam din bytes in String");        
    }
    
    public void write() {
        System.out.println("Transformam din String in bytes");
        fluxLowLevel.write();
    }
}