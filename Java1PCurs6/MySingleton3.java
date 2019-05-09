public class MySingleton3 {
    private MySingleton3(){

    }
    
    private static class MySingleton3Holder {
        private static final MySingleton3 instance = new MySingleton3();
    }
    public static MySingleton3 getInstance(){
        return MySingleton3Holder.instance;
        }
        
    }
