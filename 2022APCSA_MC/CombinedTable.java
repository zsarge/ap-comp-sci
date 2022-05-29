public class CombinedTable {
  private SingleTable s1, s2;
  
  public CombinedTable(SingleTable a, SingleTable b) {
    s1 = a;
    s2 = b;
  }
  
  public boolean canSeat(int s) {
    return s <= s1.getNumSeats() + s2.getNumSeats() - 2;
  }

  public double getDesirability() {
    double output = (s1.getViewQuality() + s2.getViewQuality() ) / 2;
    if( s1.getHeight() != s2.getHeight() ) {
      output -= 10.0;
    }
    return output;
  }
  
  public static void main(String[] args) {
    SingleTable t1 = new SingleTable(4, 60.0, 74);
    SingleTable t2 = new SingleTable(8, 70.0, 74);
    SingleTable t3 = new SingleTable(12, 75.0, 76);
    
    CombinedTable c1 = new  CombinedTable(t1, t2);
    System.out.println( c1.canSeat(9) );
    System.out.println( c1.canSeat(11) );
    System.out.println( c1.getDesirability() );
    
    CombinedTable c2 = new  CombinedTable(t2, t3);
    System.out.println( c2.canSeat(18) );
    System.out.println( c2.getDesirability() );
    t2.setViewQuality(80);
    System.out.println( c2.getDesirability() );
  }
}
