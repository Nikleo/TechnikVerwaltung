package technikverwaltung.cam;


import com.googlecode.javacv.FrameGrabber.Exception;
import com.googlecode.javacv.OpenCVFrameGrabber;
import com.googlecode.javacv.cpp.opencv_core.IplImage;
import static com.googlecode.javacv.cpp.opencv_highgui.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class which Provides the Service to get Images and Buffered Images from a
 * given Input Device like a Webcam
 *
 * @author Sheepy
 * @date 28.07.2010
 */
public class ImageGrabber {

    public void captureFrame() {
        try {
            // 0-default camera, 1 - next...so on
            final OpenCVFrameGrabber grabber = new OpenCVFrameGrabber(0);
            
                grabber.start();
                IplImage img = grabber.grab();
                if (img != null) {

                    cvSaveImage("capture.jpg", img);
                }
        } catch (Exception ex) {
            Logger.getLogger(ImageGrabber.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}