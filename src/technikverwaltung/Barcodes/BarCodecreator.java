/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package technikverwaltung.Barcodes;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programmieren
 */
public class BarCodecreator {

    public void createBarcode(String Name) {
        try {
            int width = 220;
            int height = 48;
            long i = new Long("100000000000");






            String benutzerverz = System.getProperty("user.dir");
            File verzeichniss = new File(benutzerverz + "/barcodes/");
            if (verzeichniss.mkdirs()) {
                System.out.println("File erstellt");
            }
            File f = new File(benutzerverz + "/barcodes/", Name + ".png");

            String text = "137676373781"; // this is the text that we want to encode  

            // (ImageIO.getWriterFormatNames() returns a list of supported formats)  
            String imageFormat = "png"; // could be "gif", "tiff", "jpeg"   


            BitMatrix byteMatrix = new MultiFormatWriter().encode(text, BarcodeFormat.ITF, 113, 98);
            
            MatrixToImageWriter.writeToFile(byteMatrix, "png", f);
            
        } catch (WriterException ex) {
            Logger.getLogger(BarCodecreator.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(BarCodecreator.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
