import java.util.ArrayList;

public class ClubMembers {
  
  private ArrayList<MemberInfo> memberList;
  
  public ClubMembers() {
    memberList = new ArrayList<MemberInfo>();
  }
  
  public void addMember(MemberInfo m) {
    memberList.add(m);
  }

  /** Adds new club members to memberList, as described in part (a).  
    * Precondition: names is a non-empty array.  
    */  
  public void addMembers(String[] names, int gradYear) {
    for(String s : names) {
      MemberInfo m = new MemberInfo(s, gradYear, true);
      memberList.add(m);
    }
  }
  
  /** Removes members who have graduated and returns a list of members who have graduated  * and are in good standing, as described in part (b).  
    */  
  public ArrayList<MemberInfo> removeMembers(int year) {
    ArrayList<MemberInfo> output = new ArrayList<MemberInfo>();
    int len = memberList.size();
    for(int i = len - 1; i >= 0; i--) {
      MemberInfo m = memberList.get(i);
      if( m.getGradYear() <= year && m.inGoodStanding() ) {
        output.add(m);
      }
      if(m.getGradYear() <= year) {
        memberList.remove(i);
      }
    }
    return output;
  }
  
  public String toString() {
    String output = "";
    for(MemberInfo m : memberList) {
      output += m.toString() + "\n";
    }
    return output;
  }
  
  public static void main(String[] args) {
    MemberInfo m1 = new MemberInfo("SMITH, JANE", 2019, false);
    MemberInfo m2 = new MemberInfo("FOX, STEVE", 2018, true);
    MemberInfo m3 = new MemberInfo("XIN, MICHAEL", 2017, false);
    MemberInfo m4 = new MemberInfo("GARCIA, MARIA", 2020, true);
    
    ClubMembers c = new ClubMembers();
    c.addMember(m1);
    c.addMember(m2);
    c.addMember(m3);
    c.addMember(m4);
    System.out.println(c);
    
    ArrayList<MemberInfo> goodGrads = c.removeMembers(2018);
    System.out.println(c);
    System.out.println(goodGrads);
  }
}
