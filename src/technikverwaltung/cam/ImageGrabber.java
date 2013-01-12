package technikverwaltung.cam;

import java.awt.Image;
 
import javax.media.Buffer;
import javax.media.Manager;
import javax.media.MediaLocator;
import javax.media.Player;
import javax.media.control.FrameGrabbingControl;
import javax.media.format.VideoFormat;
 
import com.sun.media.util.BufferToBufferedImage;
 
/**
 * Class which Provides the Service to get Images and Buffered Images 
 * from a given Input Device like a Webcam
 * @author  Sheepy
 * @date    28.07.2010
 */
public class ImageGrabber {
    
    /**
     * A javax.media.Player for the Video Device
     */
    private Player _player;
    
    /**
     * Method to capture an Image from the Device
     * Returns null if there isn't a running device or the Capturing is Not Ready
     * @return Image - An Image which is captures
     */
    public Image grabbImage() {
        FrameGrabbingControl fgc = (FrameGrabbingControl) _player.getControl("javax.media.control.FrameGrabbingControl");
        Buffer b = fgc.grabFrame();
        Image img = null;
        try {
            BufferToBufferedImage bbtoi = new BufferToBufferedImage((VideoFormat) b.getFormat());
            img = bbtoi.createImage(b);
            return img;
        }
        catch (Exception e) {
            return null;
        }
    }
    
    
    /**
     * Initialize the Player as a Capturing Device so that you can grab Pictures
     * This can take several Seconds, depending on System and Environment
     */
    public void initalizePlayer(){
        try{
        MediaLocator videoMediaLocator = new MediaLocator("vfw:/0");
        _player = Manager.createRealizedPlayer(videoMediaLocator);
        }catch(Exception e){
            e.printStackTrace();
        }
        _player.start();
    }
    
    /**
     * Return true if it is possible to Capture Real Images
     * @return boolean - true if the ImageGrabber is working
     */
    public boolean isReady(){
        return grabbImage() != null;
    }
    public void closeGrabber(){
    _player.close();
}
}