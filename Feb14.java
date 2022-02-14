import java.util.Scanner;
public class Feb14{
  public static void main(String[] args){
    Scanner inp = new Scanner(System.in);
    System.out.println("What is your first number?");
    int a = inp.nextInt();
    System.out.println("What is your second number?");
    int b = inp.nextInt();
    System.out.println("What is your third number?");
    int c = inp.nextInt();
    inp.close();
    if(a>b){
      if(a>c){
        System.out.println("The highest number is: "+ a);
      }
      else if (a==c){
        System.out.println(c+ " and "+ a + " are equal and the highest number.");
      }
      else{
        System.out.println("The highest number is: "+ c);
      }
    }
    else if (a==b){
      if (b==c){
        System.out.println(a+ ", "+ c + " and "+ b + " are equal and the highest number.");
      }
      else{
        System.out.println(a+ " and "+ b + " are equal and the highest number.");
      }
    }
    else{
      if(b>c){
        System.out.println("The highest number is: "+ b);
      }
      else if (b==c){
        System.out.println(c+ " and "+ b + " are equal and the highest number.");
      }
      else{
        System.out.println("The highest number is: "+ c);
      }
    }
  }
}
