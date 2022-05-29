public class Timer {
  
  private long start, stop;
  
  public Timer() {
     stop = start = System.nanoTime();
  }
  
  public void start() {
    start = System.nanoTime();
  }
  
  public void stop() {
    stop = System.nanoTime();
  }

  public double getTime() {
    return ( ( (stop - start) / 1000000) * 1000000) / 1000000000.0;
  }
  
  public String toString() {
    return this.getTime() + " seconds";
  }
  
  public static void delay(long milliSeconds) {
    long future = System.nanoTime() + milliSeconds * 1000000;
    while( future  > System.nanoTime() ) {
    }
  }

  public static void creepyType(String str) {
    int len = str.length();
    for(int i = 0; i < len; i++) {
      System.out.print( str.substring(i, i + 1) );
      delay(500);
    }
    System.out.println();
  }
  
  public static void randomType(String str) {
    int len = str.length();
    for(int i = 0; i < len; i++) {
      System.out.print( str.substring(i, i + 1) );
      delay( randInt(100, 500) );
    }
    System.out.println();
  }
  
  public static int randInt(int min, int max) {
    return (int)Math.floor( Math.random() * (max - min + 1) ) + min;
  }
  
  public static void countDown(int n) {
    for(int i = 0; i < n; i++) {
      System.out.println(n - i);
      delay(1000);
    }
    System.out.println("Blastoff!");
    /*
    for(int i = n; i > 0; i--) {
      System.out.println(i);
      delay(1000);
    }
    System.out.println("Blastoff!");
    */
  }

  public static void main(String[] args) {
     //countDown(10); 
    Timer t = new Timer();
    t.start();
    // delay(2001);
    randomType("Hello there, general kenobi");
    t.stop();
    System.out.println(t);
  }
}
