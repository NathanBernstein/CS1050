import java.util.Scanner;
public class ExFeb9{
  public static void main(String[] args){
      Scanner inp = new Scanner(System.in);
      System.out.println("What is the first grade?");
      int num1 = inp.nextInt();
      System.out.println("What is the second grade?");
      int num2 = inp.nextInt();
      System.out.println("What is the third grade?");
      int num3 = inp.nextInt();
      System.out.println("What is the fourth grade?");
      int num4 = inp.nextInt();
      inp.close();
      double avg = ((num1+num2+num3+num4)/4);
      if(avg<50){System.out.println("Fail");}
      else{System.out.println("Pass");}
  }
}
