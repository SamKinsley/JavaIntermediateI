//Ip5 using general path class to draw a non standard shap
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import java.util.Random;
import javax.swing.JPanel;
public class Shapes2D extends JPanel {
    //draw general path
    @Override
    public void paint(Graphics h){
        super.paint(h); //call superclasse's paint
        Random random= new Random();
        
        int xPoints[] = {55, 67, 109, 73, 83, 55, 27, 37, 1, 43};
        int yPoints[] = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36};
        
        Graphics2D h2d = (Graphics2D) h;
        GeneralPath star = new GeneralPath(); //create General Path object
        //set the intitial coordinate of the general path
        star.moveTo( xPoints[0], yPoints[0]);
        
        //create the star -- this does not draw the star
        for (int count = 1; count < xPoints.length; count++)
            star.lineTo(xPoints[count], yPoints[count]);
        star.closePath(); //close the shape
        
        h2d.translate(200, 200); //translate the orgin
        h2d.setColor(Color.BLUE);
        h2d.fill(star); //draw fill star
        
     
    }
    
 
    //Attempting to get Company's name on with Logo
    public void paint2 (Graphics l){
        super.paint(l);
        Graphics2D l2D = (Graphics2D) l;
        l.drawString("Company's Name", 50, 50);
    }
}
