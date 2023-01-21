
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author habibun
 */
public class Class1 {
    public static void main(String args[]) throws IOException
    {
        File file = new File("testImg.jpg");
        BufferedImage image = ImageIO.read(file);

        BufferedImage img = new BufferedImage(image.getHeight(),image.getWidth(),
                BufferedImage.TYPE_INT_RGB);

        ImageIO.write(img,"jpg",new File("updatedOutput.jpg"));

    }
}
