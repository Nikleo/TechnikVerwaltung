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
@Table(name = "inventar_kategories")
public class InventarKategoriesDB {
    @Id  
    Integer id;  
      
    String kategorie;  
      
    String oberkategorie;  
      
    @Version  
    Timestamp lastUpdate;  

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKategorie() {
        return kategorie;
    }

    public void setKategorie(String kategorie) {
        this.kategorie = kategorie;
    }

    public String getOberkategorie() {
        return oberkategorie;
    }

    public void setOberkategorie(String oberkategorie) {
        this.oberkategorie = oberkategorie;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    
}
