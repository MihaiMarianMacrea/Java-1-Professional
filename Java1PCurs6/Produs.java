public class Produs{
    String denumire;
    double pret;
    double discount;
    int stoc;
    String furnizor;
    double greutate;
    
    public static class Builder {
        private Produs p = new Produs();
        
        public Builder setDenumire(String denumire) {
            p.denumire = denumire;
            return this;
        }
        
        public Builder setPret(double pret) {
            p.pret = pret;
            return this;
        }
        
        public Builder setDiscount(double discount) {
            p.discount = discount;
            return this;
        }
        
        public Builder setStoc(int stoc) {
            p.stoc = stoc;
            return this;
        }
        
        public Builder setFurnizor(String furnizor) {
            p.furnizor = furnizor;
            return this;
        }
        
        public Builder setGreutate (double greutate){
            p.greutate = greutate;
            return this;
        }
        
        public Produs build() {
            return p;
        }
    }
}