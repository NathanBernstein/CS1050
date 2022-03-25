/*
Nate Bernstein
CS1050
March 18
*/
import java.util.Scanner;
import java.util.Random;
public class numberguess{
  public static boolean numcheck(int user_input){
    boolean var = false;
    Random rand = new Random();
    int randint = rand.nextInt(10);
    randint +=1;
    if (randint==user_input){
      var = true;
    }
    return var;
  }
  public static void main(String[] args){
    boolean run = true;
    Scanner inp = new Scanner(System.in);
    while (run){
      System.out.print("Please enter a number between 1 and 10! ");
      int num = inp.nextInt();
      if (num<1||num>10){
        System.out.println("Please try again, enter a proper number!");
      }
      else{
        if (numcheck(num)){
          System.out.println("You are the winner!");
        }
        else{
          System.out.println("Sorry, better luck next time!");
        }
      }
      System.out.println("Would you like to play again?(please enter yes/no): ");
      inp.nextLine();
      String ans = inp.nextLine();
      if(ans.equals("no")){
        run=false;
      }
    }
    inp.close();
  }
}
