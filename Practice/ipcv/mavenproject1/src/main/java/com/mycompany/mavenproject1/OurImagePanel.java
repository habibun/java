 // OurImagePanel.java
      // This class allows the user to draw and erase on the application.
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;



/**
 *
 * @author raihan
 */
      public class OurImagePanel extends JPanel
      {
          private BufferedImage image;
          private String image_name = "Default.jpg";

          private BufferedImage sourceImg;
          private BufferedImage destImg;
          private Graphics2D graphics;
         
      
       public OurImagePanel()
       {

           this.loadImage();
//           System.out.println("exit..."); System.exit(0);
           setSize(this.getImage().getWidth(this),this.getImage().getHeight(this));
           createBufferedImages();
       }

       public String writeImage()
       {
           String edgeImage = "OutImage.jpg";
           try{
            ImageIO.write(destImg,"jpg",new File(edgeImage));
           }
           catch(IOException ex)
           {

           }
           return edgeImage;
       }

       public void createBufferedImages()
       {

           sourceImg = new BufferedImage(image.getWidth(this),image.getHeight(this),
                   BufferedImage.TYPE_INT_RGB);
           graphics = sourceImg.createGraphics();
           graphics.drawImage(image,0,0,this);
           destImg= new BufferedImage(image.getWidth(this),image.getHeight(this),BufferedImage.TYPE_INT_RGB);

       }

       public void useMedianFilter()
       {
           //
       }

       public void imageSharpen()
       {
           float data[] = {-1.0f,-1.0f,-1.0f,-1.0f,9.0f,-1.0f,-1.0f,-1.0f,-1.0f,-2.0f,-1.5f,-1.0f,-1.0f,-1.0f,7.0f,3.0f};
           Kernel kernel = new Kernel(4,4,data);
           ConvolveOp convolve = new ConvolveOp(kernel,ConvolveOp.EDGE_NO_OP,null);
           convolve.filter(sourceImg, destImg);
       }
       public void imageBlur()
       {
           float data[] = {0.0625f,25f,0.0625f,0.125f,0.25f,0.125f,0.0625f,25f,0.0625f};
           Kernel kernel = new Kernel(3,3,data);
           ConvolveOp convolve = new ConvolveOp(kernel,ConvolveOp.EDGE_NO_OP,null);
           convolve.filter(sourceImg, destImg);
       }
       //ConvloveOP   and kernel

       public void edgeDetect()
       {
           float data[] = {1.0f,2.0f,1.0f,0.0f,0.0f,0.0f,-1.0f,-2.0f,-1.0f};
                    Kernel kernel = new Kernel(3,3,data);
           ConvolveOp convolve = new ConvolveOp(kernel,ConvolveOp.EDGE_ZERO_FILL,null);
           convolve.filter(sourceImg, destImg);
       }
       public void loadImage()
       {
        try{
            //System.out.println(new File(this.getImage_name()).getAbsolutePath()); // Try this to pinpoint your issue
            //System.exit(0);
            setImage(ImageIO.read(new File(this.getImage_name())));
        }
            catch(IOException ie){
//                System.out.println("exit..."); System.exit(0);
                System.out.println(ie.getMessage());
            }
        }
		  
    @Override
     public void paintComponent( Graphics g )
     {
        super.paintComponent(g);
        g.drawImage(getImage(),0,0,this);
     }

    /**
     * @return the image
     */
    public BufferedImage getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(BufferedImage image) {
        this.image = image;
    }

    /**
     * @return the image_name
     */
    public String getImage_name() {
        return image_name;
    }

    /**
     * @param image_name the image_name to set
     */
    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }

 

  } 
