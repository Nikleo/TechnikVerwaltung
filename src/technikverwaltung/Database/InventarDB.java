/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package technikverwaltung.Database;

import java.sql.Timestamp;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 *
 * @author Programmieren
 */
@Entity
@Table(name = "inventar")
public class InventarDB {
    @Id  
    Integer id;  
      
    String name;
    
    String Kategorie;
      
    int Status;
    
    double Grundpreis;
    
    double Ppt;
    
    double kaution;
    
    String verwendung;
      
    @Version  
    Timestamp lastUpdate;  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getKategorie() {
        return Kategorie;
    }

    public void setKategorie(String Kategorie) {
        this.Kategorie = Kategorie;
    }

    public double getKaution() {
        return kaution;
    }

    public void setKaution(double kaution) {
        this.kaution = kaution;
    }

    public String getVerwendung() {
        return verwendung;
    }

    public void setVerwendung(String verwendung) {
        this.verwendung = verwendung;
    }

    public double getGrundpreis() {
        return Grundpreis;
    }

    public void setGrundpreis(double GrundPreis) {
        this.Grundpreis = GrundPreis;
    }

    public double getPpt() {
        return Ppt;
    }

    public void setPpt(double PpT) {
        this.Ppt = PpT;
    }
    
    
}
