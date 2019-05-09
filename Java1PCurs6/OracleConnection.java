public class OracleConnection implements Connection {
    @Override
    public void makeConnection() {
        System.out.println("Making a conection to a Oracle DB");
    }
}