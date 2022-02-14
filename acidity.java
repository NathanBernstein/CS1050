import java.util.Scanner; //Import scanner for later use
public class acidity{
  public static void main(String[] args){
    Scanner inp = new Scanner(System.in);
    System.out.println("What is the PH of your rainwater?");
    String str = inp.nextLine();
    inp.close();
    double dou = Double.parseDouble(str);
    if(dou < 0 || dou > 14){
      System.out.println("Please enter a PH number between 0 and 14!");
    }
    else if(dou < 3){
      System.out.println("Your rain water has a PH of "+ dou +" and is a Very Acidic solution.");
    }
    else if(dou < 7){
      System.out.println("Your rain water has a PH of "+ dou +" and is an Acidic solution.");
    }
    else if(dou == 7){
      System.out.println("Your rain water has a PH of "+ dou +" and is a Neutral solution.");
    }
    else if(dou < 12){
      System.out.println("Your rain water has a PH of "+ dou +" and is an Alkaline solution.");
    }
    else if(dou <= 14){
      System.out.println("Your rain water has a PH of "+ dou +" and is a Very Alkaline solution.");
    }


  }
}
