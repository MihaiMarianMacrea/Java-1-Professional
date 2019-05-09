public class MySingleton2{
    //duble locking singleton
    private static MySingleton2 instance = new MySingleton2();  

    private MySingleton2(){

    }

    public static MySingleton2 getInstance(){
        if(instance == null){
            synchronized(MySingleton2.class){
                if(instance == null){
                    instance = new MySingleton2();
                }
            }
        }
        return instance;
    }
}