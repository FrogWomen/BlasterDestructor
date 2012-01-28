package blasterdestuctor;

/**********************************************
 * copyright 2012 Jennifer Grace DeSantis
 **********************************************/
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.Timer;

public class BlasterDestuctor extends JComponent implements ActionListener, KeyListener
{
    JFrame shooter;
    int width = Toolkit.getDefaultToolkit().getScreenSize().width;
    int height = Toolkit.getDefaultToolkit().getScreenSize().height;
    Timer tickity;
    MotherShip enterprise;
    URL froggyAddress = getClass().getResource("TreeFrogMotherShip.jpg");
    Image froggy;
    Asteroid fly;
    private int froggyCourse;
    private int froggySpeed;
    
    public static void main(String[] args)
    {
        new BlasterDestuctor().getGoing();
    }
    
    public void getGoing()
    {
        fly = new Asteroid();
        try
        {
            froggy = ImageIO.read(froggyAddress);
        } catch (IOException ex)
        {
            System.out.println("hiccup");
        }
        
        tickity = new Timer(20, this);
        shooter = new JFrame("asteroidDestuctor");
        shooter.addKeyListener(this);
        shooter.add(this);
        shooter.setSize(width, height);
        shooter.setVisible(true);
        shooter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        shooter.setBackground(Color.BLACK);
        enterprise = new MotherShip();
        enterprise.setFroggyImage(froggy);
        tickity.start();
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        repaint();
    }
    
    @Override
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        enterprise.paintSelf(g2);
        fly.paintSelf(g2);
    }
    
    @Override
    //32 space, 37 left, 38 up, 39 right, 40 down
    public void keyTyped(KeyEvent mushrooms)
    {
        
    }
    
    @Override
    public void keyPressed(KeyEvent ke)
    {
        if (ke.getKeyCode() == 39)
        {
            froggyCourse++;
            if (froggyCourse > 359)
            {
                froggyCourse = 0;
            }
            enterprise.setFroggyCourse(froggyCourse);            
        }        
        if (ke.getKeyCode() == 37)
        {
            froggyCourse--;
            if (froggyCourse < 0)
            {
               froggyCourse = 359; 
            }
            enterprise.setFroggyCourse(froggyCourse);
        }
        if (ke.getKeyCode() == 38)
        {
            froggySpeed++;
            enterprise.setFroggySpeed(froggySpeed);
        }
        if (ke.getKeyCode() == 40)
        {
            froggySpeed--;
            enterprise.setFroggySpeed(froggySpeed);
        }
    }
    
    @Override
    public void keyReleased(KeyEvent ke)
    {
    }
}
