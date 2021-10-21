import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

public class SimpleGraphics extends Canvas {
  final static int WIDTH = 512;
  final static int HEIGHT = 512;
  final static Color BACKGROUD_GRAY = new Color(238, 238, 238);
  
  public static void main(String[] args) {
    JFrame frame = new JFrame("A Simple Example of Graphics");
    Canvas canvas = new SimpleGraphics();
    canvas.setSize(WIDTH, HEIGHT);
    frame.add(canvas);
    frame.pack();
    frame.setVisible(true);    
  }
  
  public static void drawPixel(int x, int y, Graphics g) {
    g.drawLine(x, y, x, y);
  }  
  public static void randomWalk(int i, int j, int n, Graphics g) {
    for (int k = 0; k < n; k++) {
      drawPixel(i, j, g);
      i += randInt(-1, 1);
      j += randInt(-1, 1);
    }
  }  
  public static void randomStock(Graphics g) {
    int j = 255;
    for (int k = 0; k < WIDTH; k++) {     
      drawPixel(k, j, g);
      j += randInt(-3, 1);
    }
  }  
  public void paint(Graphics g) {
    // randomWalk(WIDTH / 2, HEIGHT / 2, 200000, g); 
    randomStock(g);
  }
  public static int randInt(int min, int max) {
    return (int)Math.floor( Math.random() * (max - min + 1) ) + min;
  }
}


