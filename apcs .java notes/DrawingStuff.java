import java.awt.*; //new import for drawing

public class DrawingStuff {
  public static void main (String[] args) {
    DrawingPanel panel = new DrawingPanel(800,800);
    Graphics g = panel.getGraphics();
    //lets make a new color
    //Use rgb -> reg green blue (0-225,0-225,0-225)
    Colort mystery = new Color(225,225,0);
    panel.setBackground(mystery);
    //We can use basic colors or make own
    
    /*
import java.awt.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    DrawingPanel panel = new DrawingPanel(400, 400);
    Graphics g = panel.getGraphics();
    //make light pink
    Color ltPink = new Color(240,134,175);
    panel.setBackground(ltPink);
    //Draw Things
    g.drawRect(200,200,50,10);//(startingX, startingY, lengthX, lengthY)
    g.drawRect(5,5,100,100);
    g.setColor(Color.WHITE);
    g.fillRect(395,5,-100,100);
    g.fillRect(5,5,100,100);
    g.fillRect(295,5,100,100);
    g.setColor(Color.BLACK);
    g.drawRect(295,5,100,100);
    g.drawRect(5,5,100,100);


  }
}
*/
  }
}