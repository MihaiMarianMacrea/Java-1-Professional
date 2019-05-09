public class Exemplu4 {
    public static void main(String [] args) {
        Connection c1 = ConnectionFactory.create(
                                    ConnectionFactory.DBType.ORACLE);
        
        c1.makeConnection();                            
    }
}