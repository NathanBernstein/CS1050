import java.util.Scanner;
public class Trip{
  public static void main(String[] args){
    Scanner f = new Scanner(System.in);
    System.out.print("How many travel miles? ");
    double tmiles = f.nextDouble();
    System.out.println("The cost is: $"+((tmiles/42)*2.20));
    f.close();
  }
}
