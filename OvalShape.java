//Week 5, creating an oval shape
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
public class OvalShape extends JPanel {
    @Override
    public void paintComponent (Graphics g){
        super.paintComponent(g); //Call superclasses paint method
       this.setBackground( Color.WHITE);
        
        g.setColor( Color.BLACK);
        g.fillOval(290, 100, 90, 55);
    }
}
