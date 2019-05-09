
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Produs;


public class ProdusController {
    private static  ProdusController instance;
    private Connection con;
    
    private ProdusController() {
        String url = "jdbc:mysql://localhost/bdcurs8";
        String username = "root";
        String password = "";
        
        try {
            con = DriverManager.getConnection(url, username, password);
        } catch (SQLException ex) {
            Logger.getLogger(ProdusController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ProdusController getInstance(){
        if(instance == null){
            instance = new ProdusController();
        }
        return instance;
    };
    
    public void adauga(Produs produs){
        try {
            String sql = "insert into produs values (null, ?, ?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, produs.getDenumire());
            stmt.setDouble(2, produs.getPret());
            stmt.setInt(3, produs.getStoc());
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdusController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Produs> getProdus() {
        List<Produs> produse = new ArrayList<>();
        
        String sql = "select denumire, pret, stoc from produs";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String denumire = rs.getString(1);
                double pret = rs.getDouble(2);
                int stoc = rs.getInt(3);
                produse.add(new Produs(denumire, pret, stoc));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdusController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return produse;
    }
    public void modificaPret(String denumire, double pret){
        String sql = "update produs set pret = ? where denumire = ?";
        try {
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setDouble(1, pret);
            stmt.setString(2, denumire);
            stmt.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ProdusController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
