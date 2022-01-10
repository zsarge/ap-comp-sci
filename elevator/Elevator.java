import java.util.Scanner;

class Elevator {

  private boolean goingUp, doorOpen;
  private int currentFloor;
  private boolean[] pickIn, pickOutUp, pickOutDown;
  Scanner input;

  //PRE-CONDITION: numberOfFloors > 0
  public Elevator(int numberOfFloors) {
    goingUp = true;
    doorOpen = false;
    currentFloor = 0;
    pickIn = new boolean[numberOfFloors];
    pickOutUp = new boolean[numberOfFloors];
    pickOutDown = new boolean[numberOfFloors];

    input = new Scanner(System.in);
  }

  public void pickIn(int floor) {
    if(0 <= floor && floor < pickIn.length) {//top floor is length - 1
      pickIn[floor] = true;
    }
    else {
      System.out.println("Floor picked is not available.");
    }
  }

  public void pickOutUp(int floor) {
    if(0 <= floor && floor < pickOutUp.length - 1) {  //Cannot pick top floor
      pickOutUp[floor] = true;
    }
    else {
      System.out.println("Floor picked is not available.");
    }
  }

  public void pickOutDown(int floor) {
    if(0 < floor && floor < pickIn.length) {  //Cannot pick 0th floor
      pickOutDown[floor] = true;
    }
    else {
      System.out.println("Floor picked is not available.");
    }
  }

  private char formatBool(boolean state) {
    return state ? '*' : 'o';
  }

  public int nearestUpPicked() {
    for (int i = currentFloor + 1; i < pickIn.length; i++)
      if (pickOutUp[i] || pickOutDown[i] || pickIn[i])
        return i;
    return currentFloor;
  }

  public int nearestDownPicked() {
    for (int i = currentFloor - 1; i >= 0; i--)
      if (pickOutUp[i] || pickOutDown[i] || pickIn[i])
        return i;
    return currentFloor;
  }

  public int nextFloorPicked() {
    int output = currentFloor;
    if (goingUp) {
      output = nearestUpPicked();
      if (output == currentFloor) {
        return nearestDownPicked();
      }
    } else {
      output = nearestDownPicked();
      if (output == currentFloor) {
        return nearestUpPicked();
      }
    }
    return output;
  }

  public void promptUser() {
    System.out.println("Please enter all floors going up: (enter to end)");
    String choice = input.nextLine();
    while (!choice.equals("")) {
      pickOutUp(Integer.valueOf(choice));
      choice = input.nextLine();
    }

    System.out.println("Please enter all floors going down: (enter to end)");
    choice = input.nextLine();
    while (!choice.equals("")) {
      pickOutDown(Integer.valueOf(choice));
      choice = input.nextLine();
    }

    System.out.println("Please enter all floors chosen on the inside: (enter to end)");
    choice = input.nextLine();
    while (!choice.equals("")) {
      pickIn(Integer.valueOf(choice));
      choice = input.nextLine();
    }
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("current floor = " + currentFloor + "\n");
    sb.append("=================\n");
    sb.append("Going " + (goingUp ? "up" : "down") + " \n");
    sb.append("[Door is " + (doorOpen ? "open" : "closed") + "]\n");

    sb.append("Floor\tPI\tPOU\tPOD\n");
    for (int i = pickIn.length - 1; i >= 0; i--) {
      sb.append(i + "\t");
      sb.append(formatBool(pickIn[i]) + "\t");
      sb.append(formatBool(pickOutUp[i]) + "\t");
      sb.append(formatBool(pickOutDown[i]) + "\n");
    }

    return sb.toString();
  }

  public static void main(String[] arg) {
    Elevator e = new Elevator(10);
    e.promptUser();
    // e.pickIn(0);
    // e.pickOutUp(0);
    // e.pickOutDown(0);
    // e.pickIn(2);
    // e.pickOutUp(3);
    // e.pickOutDown(4);
    // e.pickIn(5);
    // e.pickOutUp(6);
    // e.pickOutDown(7);
    // e.pickIn(9);
    // e.pickOutUp(9);
    // e.pickOutDown(9);
    System.out.println(e);
  }
}
