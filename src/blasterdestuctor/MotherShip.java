package blasterdestuctor;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class MotherShip
{
    int froggyDeltaX;
    int froggyDeltaY;
    private int froggyCourse;
    private int froggySpeed;
    private Image froggyImage;
    private AffineTransform motherShipAT;
    private Area motherShipArea;
    private Rectangle2D.Double motherShipRectangle;
    private URL froggyImageAdress;
    private int screenX = 500;
    private int screenY = 500;

    public MotherShip()
    {
        froggyImageAdress = getClass().getResource("TreeFrogMotherShip.png");
        try
        {
            froggyImage = ImageIO.read(froggyImageAdress);
        } catch (IOException ex)
        {
            System.out.println("hiccup trying to read froggyImage");
        }
        int froggyWidth = froggyImage.getWidth(null);
        int froggyHeight = froggyImage.getHeight(null);
        motherShipRectangle = new Rectangle2D.Double(0, 0, froggyWidth, froggyHeight);
        motherShipArea = new Area(motherShipRectangle);
    }

    public void paintSelf(Graphics2D g2)
    {
        froggyDeltaX = (int) (froggySpeed * Math.sin(Math.toRadians(froggyCourse)));
        froggyDeltaY = -(int) (froggySpeed * Math.cos(Math.toRadians(froggyCourse)));
        screenX += froggyDeltaX;
        screenY += froggyDeltaY;
        g2.translate(screenX, screenY);
        g2.rotate(Math.toRadians(froggyCourse));
        g2.drawImage(froggyImage, 0, 0, null);
        g2.setColor(Color.green);
        g2.draw(motherShipArea);
    }

    public void setFroggyCourse(int froggyCourseJenny)
    {
        froggyCourse = froggyCourseJenny;
        System.out.println(froggyCourse);
    }

    public void setFroggySpeed(int froggySpeedJenny)
    {
        froggySpeed = froggySpeedJenny;
        System.out.println(froggySpeed);
    }

    public void setFroggyImage(Image froggyImage)
    {
        this.froggyImage = froggyImage;
    }
}
