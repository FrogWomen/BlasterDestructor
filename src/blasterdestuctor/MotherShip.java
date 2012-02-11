package blasterdestuctor;

import java.awt.Graphics2D;
import java.awt.Image;

public class MotherShip
{
    int froggyDeltaX;
    int froggyDeltaY;
    private int froggyCourse;
    private int froggySpeed;
    private Image froggyImage;

    public void paintSelf(Graphics2D g2)
    {
g2.translate(-155, -155);
        g2.rotate(Math.toRadians(froggyCourse));
        g2.drawImage(froggyImage, 0, 0, null);
        
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

