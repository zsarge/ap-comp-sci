public class SingleTable  { 
  private int seats, height;
  private double viewQuality;
  
  public SingleTable(int s, double vq, int h)  {
    if(s >= 4) {  
      seats = s;
    }
    else {
      seats = 4;
    }
    viewQuality = vq;
    height = h;
  }
  
  /** Returns the number of seats at this table. The value is always greater than or equal to 4. */ 
  public int getNumSeats()  {
    return seats;
  }
  
  /** Returns the height of this table in centimeters. */  
  public int getHeight()  {
    return height;
  }
  
  /** Returns the quality of the view from this table. */  
  public double getViewQuality()  {
    return viewQuality;
  }
  
  /** Sets the quality of the view from this table to value . */  
  public void setViewQuality(double value)  {
    viewQuality = value;
  }
  
  public String toString() {
    return "The SingleTable has " + seats + " seats, a view quality of " + 
           viewQuality + ", and a height of " + height + " centimeters.";   
  }
  
  public static void main(String[] args)  {
    SingleTable t1 = new SingleTable(4, 60.0, 74);
    SingleTable t2 = new SingleTable(4, 70.0, 74);
    SingleTable t3 = new SingleTable(12, 75.0, 76);
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
    
    System.out.println( t1.getClass().getName() );
  }
}