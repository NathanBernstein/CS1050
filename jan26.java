import java.util.Scanner;
public class jan26{
  boolean bored;
  double classlength;
  public boolean amIbored(double classlength){
    if(classlength>0){
      bored = true;
    }
    else{
      bored = false;
    }
    return bored;
  }

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("How long is my class?: ");
    double number = Double.parseDouble(input.nextLine());
    input.close();
    jan26 s = new jan26();
    System.out.println("Am I bored in class again? "+s.amIbored(number));
  }
}
