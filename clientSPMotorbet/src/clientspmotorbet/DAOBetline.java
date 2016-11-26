/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientspmotorbet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Salvo
 */
public class DAOBetline {
    
    
        public boolean salva(String id,String cf, BetLine betline){
        try{
            Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/s&pmotorbet?" + "user=sep&password=123456");     
             PreparedStatement pst5 = conn.prepareStatement("Insert into betline(id,nomepilota,cognomepilota,campionato,gara,posizione,quota,cf)values('"+id+"','"+betline.getNomepilota()+"','"+betline.getCognomepilota()+"','"+betline.getCampionato()+"','"+betline.getGara()+"','"+betline.getPosizione()+"','"+betline.getQuota()+"','"+cf+"')");
                
        
             pst5.execute();
            //Inserimento del conto 
         
            conn.close();
            return true;
            }catch(Exception e){
                return false;
            }
    }
    
    
    
}
