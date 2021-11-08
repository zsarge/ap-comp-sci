import java.awt.Graphics;
import java.awt.Canvas;
import java.awt.Color;
import javax.swing.JFrame;

public class Logistic extends Canvas {
  final static int WIDTH = 1200;
  final static int HEIGHT = 600;
  final static Color WHITE = new Color(255, 255, 255);
  
  public static void main(String[] args) {
    JFrame frame = new JFrame("A Logistic Diagram");
    Canvas canvas = new Logistic();
    canvas.setSize(WIDTH, HEIGHT);
    frame.add(canvas);
    frame.pack();
    frame.setVisible(true);
  }

  public void paint(Graphics g) {
    drawLogistic(g);
  }
  
  public static void drawPixel(int x, int y, Graphics g) {
    g.drawLine(x, y, x, y);
  }
  
  public static void drawLogistic(Graphics g) {
    double x = 2 / 3.0;
    for(double A = 1.0; A <= 4.0; A += 0.001) {
      // x = 1 - (1.0 / A);
      for(int i = 0; i < 100; i++) {
        x = A*x*(1 - x);
      }
      for(int i = 0; i < 20; i++) {
        x = A*x*(1 - x);
        drawPixel( (int)(600*A) - 1200, (int)(600* (1-x)), g);
      }
    }
  }
}
