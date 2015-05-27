import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HierarchicalClusteringTest
{
    public static void main(String[] args)
    {
        JFrame application = new JFrame();
        int[] x = {40, 60, 80, 80, 100, 120, 140, 180, 200, 220, 240, 240};
        int[] y = {40, 80, 160, 200, 40, 160, 200, 60, 100, 80, 60, 120};
        ArrayList<Point> points = new ArrayList();
        for (int i = 0; i < x.length; i++)
            points.add(new Point(x[i], y[i]));
        JPanel clusterPanel = new HierarchicalClusteringPanel(points);
        application.add(clusterPanel);
        application.setSize(300, 300);
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setVisible(true);
    }
}
