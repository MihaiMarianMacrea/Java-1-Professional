public class Masina implements java.io.Serializable {
    String marca;
    int anFabricatie;
    boolean noua;
    transient double nrKilometri;
    
    
    public Masina(String marca, int anFabricatie, boolean noua, double nrKilometri){
        this.marca = marca;
        this.anFabricatie = anFabricatie;
        this.noua = noua;
        this.nrKilometri = nrKilometri;
    }
    
    @Override
    public String toString(){
        return marca + " / " + anFabricatie+ " / " + noua+" / "+ nrKilometri;
    }
}