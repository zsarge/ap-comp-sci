import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

public class Mandelbrot extends Canvas {
  final static int WIDTH  = 1200;
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

  public static void drawMandelbrot(Graphics g) {
    final double inc = 0.001;
    for (double i = -2.0; i <= 2.0; i+= inc) {
      for (double j = -2.0; j <= 2.0; j += inc) {
        Complex c = new Complex(i, j);
        if (benoit(c))
          drawComplex(c, g);
      }
    }
  }

  public static boolean benoit(Complex c) {
	Complex z = new Complex(0.0, 0.0);
	int count = 0;
	double magicNumber = 3.0;
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
	final int scalar = 300;
	int x = (int) Math.round(scalar*z.re()) + WIDTH / 2;
	int y = (int) Math.round(-scalar*z.im()) + HEIGHT / 2;
    drawPixel(x, y, g);
  }
  public static int randInt(int min, int max) {
    return (int)Math.floor( Math.random() * (max - min + 1) ) + min;
  }
}

