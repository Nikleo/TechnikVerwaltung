/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package technikverwaltung;

import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.EbeanServerFactory;
import com.avaje.ebean.config.DataSourceConfig;
import com.avaje.ebean.config.ServerConfig;
import technikverwaltung.Barcodes.BarCodecreator;
import technikverwaltung.Guis.Webcamebarcode;

/**
 *
 * 
 * 
 * @author Programmieren
 */
public class TechnikVerwaltung {

    /**
     * @param args the command line arguments
     */
    
    public EbeanServer dbserver; 
    public static TechnikVerwaltung instance;
    
    public static void main(String[] args) {
        
        instance = new TechnikVerwaltung();
        //instance.setupDatabase();
        BarCodecreator bcg = new BarCodecreator();
        bcg.createBarcode( "test2");
        Webcamebarcode login= new Webcamebarcode();
        login.setVisible(true);
        
        
    }
   

    public void setupDatabase() {
        // specify the  

        ServerConfig config = new ServerConfig();
        config.setName("dbconfig");

// Define DataSource parameters  
        DataSourceConfig mysql = new DataSourceConfig();
        mysql.setDriver("com.mysql.jdbc.Driver");
        mysql.setUsername("technik");
        mysql.setPassword("dmx512");
        mysql.setUrl("jdbc:mysql://127.0.0.1:3306/technik");

        config.setDataSourceConfig(mysql);

// specify a JNDI DataSource   
// config.setDataSourceJndiName("someJndiDataSourceName");  

// set DDL options...  
        config.setDdlGenerate(true);
        config.setDdlRun(false);

        config.setDefaultServer(true);
        config.setRegister(false);
        
        config.addPackage("technikverwaltung.Database");
        
        
        

// create the EbeanServer instance  
       dbserver = EbeanServerFactory.create(config);
        
    }

    public EbeanServer getDbserver() {
        return dbserver;
    }
    
}
