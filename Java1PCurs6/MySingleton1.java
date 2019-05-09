public class MySingleton1{
    //eager singleton
    private static MySingleton1 instance = new MySingleton1();  
    
    private MySingleton1(){
        
    }
    
    public static MySingleton1 getInstance(){
        return instance;
    }
}