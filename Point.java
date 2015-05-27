import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class Point extends JPanel
{
    public Color c;
    private final int x;
    private final int y;
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(c);
        g.fillOval(x - 5, y - 5, 10, 10);
    }
    
    public Point(int x, int y)
    {
        Random rand = new Random();
        c = new Color(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255));
        this.x = x;
        this.y = y;
    }
    
    public int x()
    {
        return x;
    }
    
    public int y()
    {
        return y;
    }
}
