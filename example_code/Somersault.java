import java.io.IOException;
/**
 * class Somersault
 * @author (TJ Evert) (edited by Zack Sargent)
 * @version (2/27/2019)
 */
public class Somersault {

  //clears screen
  public static void clearScreen() throws IOException, InterruptedException {  
    if (System.getProperty("os.name").contains("Windows"))
      new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    else
      Runtime.getRuntime().exec("clear");
  }
  public static void main(String[] args) throws IOException, InterruptedException {
    try {
      int dt = 50;
      String space;

      while(true) {
        clearScreen();
        space = "";
        for(int i = 1; i <= 5; i++) {
          Thread.sleep(dt);
          clearScreen();
          System.out.println(space + "\\O/");
          System.out.println(space + " | ");
          System.out.println(space + "/ \\");
          Thread.sleep(dt);
          clearScreen();
          System.out.println(space + "    |O_");
          System.out.println(space + "  _ /  ");
          System.out.println(space + "   |   ");
          Thread.sleep(dt);
          clearScreen();
          System.out.println(space + "         ");
          System.out.println(space + "    \\__|O");
          System.out.println(space + "    /  \\ ");
          Thread.sleep(dt);
          clearScreen();
          System.out.println(space + "      _|  ");
          System.out.println(space + "        \\_");
          System.out.println(space + "        |O");
          Thread.sleep(dt);
          clearScreen();
          System.out.println(space + "        \\ /");
          System.out.println(space + "         | ");
          System.out.println(space + "        /O\\");
          Thread.sleep(dt);
          clearScreen();
          System.out.println(space + "            |_");
          System.out.println(space + "          _/  ");
          System.out.println(space + "          O|  ");
          Thread.sleep(dt);
          clearScreen();
          System.out.println(space + "                ");
          System.out.println(space + "           O|__/");
          System.out.println(space + "            /  \\");
          Thread.sleep(dt);
          clearScreen();
          System.out.println(space + "             _O|  ");
          System.out.println(space + "               \\ _");
          System.out.println(space + "                | ");
          space += "                ";
        }

        Thread.sleep(dt);
        clearScreen();
        System.out.println(space + " \\O/");
        System.out.println(space + "  | ");
        System.out.println(space + " / \\    Ta da!");
        Thread.sleep(3000);
      }
    }
    catch(InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException(e);
    }
  }
}
