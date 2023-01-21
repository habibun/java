package main;


import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;


/**
 *
 * @author habibun
 */
public class Image2DArray {

    public static void main(String args[])throws IOException
    {
        File file = new File("img.jpg");

        BufferedImage image = ImageIO.read(file);

        int pixels[] = new int[90000];

        int newColor;
        int k =0;

        for(int i=0;i<30;i++)
        {
            for(int j=0; j<30;j++)
            {
                int eachPexel = image.getRGB(i, j);
                //&& logical operator
                // & bitwise and operation
                // 1856 --- 18 & 08
                int red = (eachPexel & 0x00ff0000)>>16;
                int green = (eachPexel & 0x0000ff00)>>8;
                int blue = eachPexel & 0x000000ff;

                if(red < 200)
                    red = 200;
              //  System.out.println("Red:" + red +" " + "green:" + green + " "
                //        + "Blue:"+ blue);

                newColor = red<<16 | green << 8 | blue;
                pixels[k++] = newColor;

            }
        }

        BufferedImage img = new BufferedImage(300,300, BufferedImage.TYPE_INT_RGB);

        

        int l=0;
        for(int i=0;i<30;i++)
        {
            for(int j=0; j<30; j++)
            {
                img.setRGB(i,j,pixels[l++]);
            }
        }


        ImageIO.write(img, "jpg",new File("newSmallImage.jpg"));


    }

}
