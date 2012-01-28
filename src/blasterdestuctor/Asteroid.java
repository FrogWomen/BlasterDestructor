package blasterdestuctor;

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Asteroid
{
    URL dragonAddress = getClass().getResource("dragonfly.jpg");
    URL spiderAddress = getClass().getResource("Spider-Cat.jpg");
    Image dragonImage;
    Image spiderImage;

    public Asteroid()
    {
        try
        {
            dragonImage = ImageIO.read(dragonAddress);
            spiderImage = ImageIO.read(spiderAddress);
        } catch (IOException ex)
        {
            System.out.println("hiccup trying to read dragon or spider");
        }
    }

    public void paintSelf(Graphics2D g2)
    {
        g2.drawImage(dragonImage, 600, 600, null);
        g2.drawImage(spiderImage, 800, 800, null);
    }
}