
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    /*
    Conectare la o baza de date si interogari
    JDBC - Java Detabase Conectivity
         - interfete Connection - canal de comunicare intre aplicati si baza de date
                     Statement - obiectul prin intermediul caruia pot defini instructiuni SQL
                     ResultSet - repr alt obiect care se va concretiza intr-un 
                                  obiect intors de o interogare de tip Select
         - aducem driverul in aplicatia noastra- Libraries-AddLibraries-MySql JDBC Driver
    
    */
    
    public static void main(String[] args) {
        // conectare la baza de date
        String url = "jdbc:mysql://localhost/bdcurs8";
        String username = "root";
        String password = "";
        
        try {
            Connection connection = DriverManager.getConnection(
                    url, username, password);
            Statement stmt = connection.createStatement();
            String sql ="insert into produs values(null, 'mause', 80.5, 7)";
            String sql1 ="insert into produs values(null, 'tastatura', 100.5, 3)";
            stmt.executeUpdate(sql);
            stmt.executeUpdate(sql1);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}
