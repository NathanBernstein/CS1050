import java.util.Scanner;
public class guessnum{
  public static void main(String[] args){
    boolean leave = false;
    int num = 6;
    while(leave==false){
      Scanner s = new Scanner(System.in);
      System.out.println("Guess a number between 1 and 50!");
      int userin = s.nextInt();
      s.close();
      if (userin==num){
        System.out.println("You guessed correct!");
      }
      else if (usernum < 1 || userin > 50){
        System.out.println("Please enter a number between 1 and 50!");
      }
      else{
        System.out.println("Nope! Guess again!");
      }
    }
  }
}
