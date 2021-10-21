import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

public class RecursiveGraphics extends Canvas {
  final static int WIDTH = 512;
  final static int HEIGHT = 512;
  final static Color BACKGROUD_GRAY = new Color(238, 238, 238);
  
  public static void main(String[] args) {
    JFrame frame = new JFrame("Recursive Stuff");
    Canvas canvas = new RecursiveGraphics();
    canvas.setSize(WIDTH, HEIGHT);
    frame.add(canvas);
    frame.pack();
    frame.setVisible(true);    
  }
  public void paint(Graphics g) {
    drawPlusPlus(200, 200, 100, 10, g);
  }
  public static void drawPlusPlus(int x, int y, int r, int n, Graphics g) {
    if (n == 0) {
      g.drawLine(x - r, y, x + r, y);
      g.drawLine(x, y - r, x, y + r);
    } else {
      drawPlusPlus(x, y, r, n - 1, g);
      drawPlusPlus(x, y - r, r / 2, n - 1, g);
      drawPlusPlus(x, y + r, r / 2, n - 1, g);
      drawPlusPlus(x - r, y, r / 2, n - 1, g);
      drawPlusPlus(x + r, y, r / 2, n - 1, g);
    }
  }

  public static void drawPlus(int x, int y, int r, Graphics g) {
    g.drawLine(x - r, y, x + r, y);
    g.drawLine(x, y - r, x, y + r);
  }
  public static void drawPlusPlus(int x, int y, int r, Graphics g) {
    drawPlus(x, y, r, g);

    drawPlus(x, y - r, r / 2, g);
    drawPlus(x, y + r, r / 2, g);
    drawPlus(x - r, y, r / 2, g);
    drawPlus(x + r, y, r / 2, g);
  }
  public static int randInt(int min, int max) {
    return (int)Math.floor( Math.random() * (max - min + 1) ) + min;
  }
}


