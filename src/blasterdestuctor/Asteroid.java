package blasterdestuctor;

import java.awt.Graphics2D;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class Asteroid
{
    URL dragonAddress = getClass().getResource("dragonfly.png");
    URL spiderAddress = getClass().getResource("Spider-Cat.png");
    Image dragonImage;
    Image spiderImage;
    Image dragonImage2;
    Image spiderImage2;

    public Asteroid()
    {
        try
        {
            dragonImage = ImageIO.read(dragonAddress);
            dragonImage2 = ImageIO.read(dragonAddress);
            spiderImage = ImageIO.read(spiderAddress);
            spiderImage2 = ImageIO.read(spiderAddress);
        } catch (IOException ex)
        {
            System.out.println("hiccup trying to read dragon or spider");
        }
    }

    public void paintSelf(Graphics2D g2)
    {
        g2.drawImage(dragonImage, 600, 600, null);
        g2.drawImage(spiderImage, 800, 800, null);
        g2.drawImage(dragonImage2, 500, 600, null);
        g2.drawImage(spiderImage2, 900, 800, null);
    }
}