/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientspmotorbet;

/**
 *
 * @author Salvo
 */
public class Quotazione {
    
   private int posizione;
   private String CognomePilota;
   private String NomePilota;
   private String Gara;
   private String Campionato;
   private float Quota;

   
    public Quotazione() {
    }
   
   
   
   
   
   

    public int getPosizione() {
        return posizione;
    }

    public void setPosizione(int posizione) {
        this.posizione = posizione;
    }

    public String getCognomePilota() {
        return CognomePilota;
    }

    public void setCognomePilota(String CognomePilota) {
        this.CognomePilota = CognomePilota;
    }

    public String getNomePilota() {
        return NomePilota;
    }

    public void setNomePilota(String NomePilota) {
        this.NomePilota = NomePilota;
    }

    public String getGara() {
        return Gara;
    }

    public void setGara(String Gara) {
        this.Gara = Gara;
    }

    public String getCampionato() {
        return Campionato;
    }

    public void setCampionato(String Campionato) {
        this.Campionato = Campionato;
    }

    public float getQuota() {
        return Quota;
    }

    public void setQuota(float Quota) {
        this.Quota = Quota;
    }
    
    
    
    
    
    
    
}
