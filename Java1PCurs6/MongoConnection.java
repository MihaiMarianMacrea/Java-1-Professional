public class MongoConnection implements Connection {
    @Override
    public void makeConnection() {
        System.out.println("Making a conection to a Mongo DB");
    }
}