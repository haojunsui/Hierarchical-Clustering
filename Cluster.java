import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class Cluster extends JPanel
{
    public ArrayList<Point> points = new ArrayList();
    public Color c;
    public Point centroid;
    
    @Override
    public void paintComponent(Graphics g)
    {
        for (Point p : points)
            p.paintComponent(g);
    }
    
    public void setColor()
    {
        for (Point p : points)
            p.c = c;
    }
    
    public Cluster(Cluster c1, Cluster c2)
    {
        for (Point p : c1.points)
            points.add(p);
        for (Point p : c2.points)
            points.add(p);
        c = c1.c;
        setColor();
        int x = 0, y = 0;
        for (Point p : points)
        {
            x += p.x();
            y += p.y();
        }
        centroid = new Point(x / points.size(), y / points.size());
    }
    
    public Cluster(Point p)
    {
        points.add(p);
        c = p.c;
        centroid = p;
    }
}
