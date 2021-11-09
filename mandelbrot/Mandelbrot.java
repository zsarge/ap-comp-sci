import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

public class Mandelbrot extends Canvas {
  final static int WIDTH  = 600;
  final static int HEIGHT = 600;
  final static Color BACKGROUD_GRAY = new Color(238, 238, 238);
  
  public static void main(String[] args) {
    JFrame frame = new JFrame("A Simple Example of Graphics");
    Canvas canvas = new Mandelbrot();
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
  public static void drawMandelbrot(Graphics g) {
    double inc = 0.01;
    for (double i = -3.0; i <= 3.0; i+= inc) {
      for (double j = -3.0; j <= 3.0; j += inc) {
        Complex c = new Complex(i, j);
        if (benoit(c))
          drawComplex(c, g);
      }
    }
  }
  public static boolean benoit(Complex c) {
    Complex z = new Complex(0.0, 0.0);
    int count = 0;
    double magicNumber = 6;
    while (z.getR() < magicNumber && count < 20) {
      z.setComplex(z.times(z).plus(c));
      count++;
    }
    return z.getR() < magicNumber;
  }
  public void paint(Graphics g) {
    drawMandelbrot(g);
    // for (double z = -3.0; z <= 3.0; z+= 0.01) {
      // Complex c = new Complex(z,z);
      // drawComplex(c, g);
    // }
  }
  public static void drawComplex(Complex z, Graphics g) {
    int x = (int) (100*z.re()) + 300;
    int y = (int) (-100*z.im()) + 300;
    drawPixel(x, y, g);
  }
  public static int randInt(int min, int max) {
    return (int)Math.floor( Math.random() * (max - min + 1) ) + min;
  }
}


