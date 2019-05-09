import java.io.*;
public class Exemplu4 {
    /*
    Se primesc din consola urmatoarele comenzi:
    crearefisier <numefisier> - crearea fisierului cu calea specificata
    creare folder <numefolder> - crearea folderului cu calea specificata
    stergere <numefisier> - stergerea fisierului cu calea specificata
    lista <numefolder. - listarea tuturor fisierelor din folderul cu calea specificata
    list() 
    exit - inchide consola si aplicatia
     */
    public static void main(String [] argsA) {
        try( 
        InputStreamReader inputStream =  new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStream);
        ){
            while(true){
                System.out.println("COMANDA: ");
                String line = "";
                line = reader.readLine();
                String [] words = line.split("\\s+");

                switch(words[0]){
                    case "crearefisier" : 
                        File file1 = new File(words[1]);
                        file1.createNewFile();
                        System.out.println("A fost creat un fisier");
                        break;

                    case "crearefolder" :
                        File file2 = new File(words[1]);
                        file2.mkdir();
                        System.out.println("A fost creat un folder");
                        break;

                    case "stergere" : 
                        File file3 = new File(words[1]);
                        if(file3.delete()){
                            System.out.println("Fisierul a fost sters");};
                        break;

                    case "lista" :
                        File file4 = new File(words[1]);
                        String [] fileNames = file4.list();
                        for(String fileName: fileNames){
                            System.out.println(fileName);}
                        break;

                    case "exit" : 
                        System.out.println("Aplicatia se va inchide");
                        System.exit(0); break;

                    default : System.out.println("Comanda invalida!");            
                }       

            }
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}