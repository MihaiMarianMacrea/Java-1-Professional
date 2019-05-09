public class Carte {
    String titlu;
    String autor;
    int nrPagini;
    double pret;
    
    public Carte(String titlu, String autor, int nrPagini, double pret){
        this.titlu = titlu;
        this.autor = autor;
        this.nrPagini = nrPagini;
        this.pret = pret;
    }
    
    @Override
    public String toString(){
        return titlu+ " / "+ autor + " / " + nrPagini+ " / " +pret + " lei";
    }
}