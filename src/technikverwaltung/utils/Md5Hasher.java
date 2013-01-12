/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package technikverwaltung.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Programmieren
 */
public class Md5Hasher {
    
    public String decrypte(String password){
        
        /*
         * Berechnung
         */
        String hashword = null;
        if (password != null) {
            try {
                MessageDigest md5 = MessageDigest.getInstance("MD5");
                md5.update(password.getBytes());
                BigInteger hash = new BigInteger(1, md5.digest());
                hashword = hash.toString(16);
            } catch (NoSuchAlgorithmException nsae) {
                // ignore
            }
        
    }
        return hashword;
    }
}
