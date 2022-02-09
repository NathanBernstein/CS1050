import java.util.Scanner;
public class golf{
  public static void main(String[] args){
    Scanner inp = new Scanner(System.in);
    System.out.println("How many strokes did you take?");
    int num = inp.nextInt();
    inp.close();
    if (num == 0){System.out.println("Invalid entry.");}
    else if (num == 1){System.out.println("Hole in 1!");}
    else if (num == 2){System.out.println("Eagle!");}
    else if (num == 3){System.out.println("Birdie!");}
    else if (num == 4){System.out.println("Par");}
    else if (num == 5){System.out.println("Bogey");}
    else if (num == 6){System.out.println("Double Bogey");}
    else{System.out.println("Better luck next time!");}
  }
}
