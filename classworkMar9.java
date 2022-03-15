import java.util.Scanner;
public class Worksheet5_7{
  public static circle(){
    System.out.println("The choice is Circle.");
  }
  public static void main(String[] args){
    Scanner inp = new Scanner(System.in);
    boolean stayin = true;
    while (stayin){
      System.out.println("\nPlease choose from the menu(1-5)\n");
      System.out.println("1. Circle\n");
      System.out.println("2. Square\n");
      System.out.println("3. Rectangle\n");
      System.out.println("4. Triangle\n");
      System.out.println("5. Exit\n");
      int userIn = inp.nextInt();
      switch(userIn){
        case 1:
            circle();
            break;
        case 2:
            System.out.println("The choice is Square.");
            break;
        case 3:
            System.out.println("The choice is Rectangle.");
            break;
        case 4:
            System.out.println("The choice is Triangle.");
            break;
        case 5:
            System.out.println("The choice is Exit, goodbye!");
            stayin = false;
            break;
      }
    }
    inp.close();

  }
}
