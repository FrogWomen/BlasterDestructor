package blasterdestuctor;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;

public class MotherShip
{
    int froggyDeltaX;
    int froggyDeltaY;
    private int froggyCourse;
    private int froggySpeed;
    private Image froggyImage;
    private AffineTransform motherShipAT;
    
    public void paintSelf(Graphics2D g2)
    {
        g2.translate(-155, -155);
        g2.rotate(Math.toRadians(froggyCourse));
        g2.drawImage(froggyImage, 0, 0, null);
        g2.setColor(Color.green);
        int froggyWidth = froggyImage.getWidth(null);
        g2.drawRect(0, 0, froggyImage.getWidth(null), froggyImage.getHeight(null));
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
