import java.io.*;

public class Exemplu1 {
    /*
     * IO streams
     * pachet java.io
     * in
     *   low level   
     *      InputStream (clasa abstracta)
     *          FileInputStream
     *          ByteArrayInputStream 
     *      
     *   high level   
     *      InputStreamReader (siruri de caractere)
     *      BufferedReader (siruri de caractere)
     *      ObjectInputStream (obiecte)
     *      DataInputStream  (primitive)
     * out
     *    low level   
     *          OutputStream
     *          FileOutputStream
     *          ByteArrayOutputStream
     *          
     *    high level
     *          PrintStream
     *          PrintWriter
     *          ObjectOutputStream
     *          DataOutputStream
     *          
            */
           
    public static void main(String [] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(reader);
        
        try {
        String line = in.readLine(); // citire linie cu linie
        System.out.println(new StringBuilder(line).reverse());
        }catch(IOException e){
        e.printStackTrace();
        }finally {
            try{
                in.close();
                reader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}