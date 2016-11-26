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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Salvo
 */
public class DAOBet {
    
    
    
    
    
     public boolean salva(Bet istanza){
        try{
            Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/s&pmotorbet?" + "user=sep&password=123456");     
            PreparedStatement pst = conn.prepareStatement("Insert into bet (id, cf, importo, vincita_potenziale) values('"+istanza.getId()+"','"+istanza.getCf()+"','"+istanza.getImporto()+"','"+istanza.getVincitaPotenziale()+"')");
            pst.execute();
            //Inserimento del conto 
         
            conn.close();
            return true;
            }catch(Exception e){
                return false;
            }
    }
    
    
     public List<Bet> caricaListaBet(String cf){
        List<Bet> listaBet = new ArrayList<Bet>();
        Bet bet;
        
         List<BetLine> listaBetLine = new ArrayList<BetLine>();
        BetLine BetLine;
        int j;
        int  i;
        try{
            Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/s&pmotorbet?" + "user=sep&password=123456");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id,data,importo,vincita_potenziale FROM bet WHERE cf='"+cf+"' ");
             i = 0;
            while(rs.next()){
                
                listaBet.add( i, bet = new Bet());
                listaBet.get(i).setCf(cf);
                listaBet.get(i).setData(rs.getTimestamp("data").toString());
                listaBet.get(i).setImporto(rs.getFloat("importo"));
                listaBet.get(i).setVincitaPotenziale(rs.getFloat("vincita_potenziale"));
                listaBet.get(i).setId(rs.getString("id"));
                
                  Statement stmt2 = conn.createStatement();
                 ResultSet rs2 = stmt2.executeQuery("SELECT nomepilota,cognomepilota,campionato,gara,posizione,quota FROM betline WHERE id='"+ rs.getString("id") +"' ");
               while(rs2.next()){  
               //listaBetLine.add( j, BetLine = new BetLine());
               
               listaBet.get(i).addBetLine(rs2.getString("nomepilota"), rs2.getString("cognomepilota"), rs2.getString("campionato"), rs2.getString("gara"), rs2.getInt("posizione"),rs2.getFloat("quota")); 
               listaBet.get(i).addPuntata(listaBet.get(i).getBetLineCorrente());
             //  j++;
                                    } rs2.close();
                i++;
            }
            
            rs.close();
            conn.close();
        }catch(Exception e){   
        }
        return listaBet;
    }
     
     
     
     
     
}
