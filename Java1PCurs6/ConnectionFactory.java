public class ConnectionFactory {
    public static enum DBType {
        ORACLE, MYSQL, MONGO
    }
    
    public static Connection create(DBType tip) {
        switch(tip) {
            case ORACLE : return new OracleConnection();
            case MYSQL : return new MySQLConnection();
            case MONGO : return new MongoConnection();
            default : throw new RuntimeException("Invalid DB type");
        }
    }
} 