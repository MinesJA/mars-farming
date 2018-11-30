import java.util.Scanner;
import java.util.TimerTask;

public class Main {
  static int counter = 0;
  static String message;
  static Farm[] farms = new Farm[10];

  private static String menu(int choice){
    if (choice == 1) {
      Main.newFarm(10,10);
      return "New Farm";
    } else {
      return "Something else";
    }
  }

  private static void newFarm(int rows, int cols){
    farms[0] = new Farm(10,10);
    System.out.println("Made new farm.");
  }




  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);

    System.out.print("1. Start a new farm.");
    System.out.print("\n");
    Integer choice = scanner.nextInt();
    String message = Main.menu(choice);


    // System.out.print("1. Plant a potato");
    // System.out.print("\n");
    // System.out.print("2. See when your next batch of potatos is ready to harvest.");
    // System.out.print("\n");
    //


    //
    // System.out.println(message);
  }
}
