
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/bdcurs8";
        String username = "root";
        String password = "";
        
        try {
            Connection connection = DriverManager.getConnection(url,username, password);
            Statement stmt = connection.createStatement();
            String sql = "select * from produs";
                    //"select denumire, pret, stoc from produs"; 
            ResultSet rs = stmt.executeQuery(sql); // arata ca un tabel
            while(rs.next()){
                int idProdus = rs.getInt(1);
                String denumire = rs.getString(2);
                double pret = rs.getDouble("pret");
                int stoc = rs.getInt(4);
                System.out.println(idProdus + " / "+ denumire + " / "+
                        pret + " / "+ stoc);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
