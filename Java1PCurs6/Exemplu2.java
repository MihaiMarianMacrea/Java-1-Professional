public class Exemplu2 {
    public static void main(String [] args) {
        Produs p1 = new Produs.Builder().setDenumire("ciocolata")
                                        .setPret(7.5)
                                        .build();
                                        
        Produs p2 = new Produs.Builder().setDenumire("telefon")
                                        .setPret(2500)
                                        .setDiscount(10.5)
                                        .setGreutate(150)
                                        .build();                                
    }

}