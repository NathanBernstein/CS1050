import java.util.Scanner; //Import scanner for later use
public class acidity{
  public static void main(String[] args){
    Scanner inp = new Scanner(System.in);
    System.out.println("What is the PH of your rainwater?");
    String str = inp.nextLine(); //Take the user's input
    inp.close();
    double dou = Double.parseDouble(str); //Change the string to a double
    if(dou < 0 || dou > 14){ //If it's not in the PH range, ask the user to try again
      System.out.println("Please enter a PH number between 0 and 14!");
    }
    else if(dou < 3){ //Conditionals
      System.out.println("Your rain water has a PH of "+ dou +" and is a Very Acidic solution.");
    }
    else if(dou < 7){ //Conditionals
      System.out.println("Your rain water has a PH of "+ dou +" and is an Acidic solution.");
    }
    else if(dou == 7){ //Conditionals
      System.out.println("Your rain water has a PH of "+ dou +" and is a Neutral solution.");
    }
    else if(dou < 12){ //Conditionals
      System.out.println("Your rain water has a PH of "+ dou +" and is an Alkaline solution.");
    }
    else if(dou <= 14){ //Conditionals
      System.out.println("Your rain water has a PH of "+ dou +" and is a Very Alkaline solution.");
    }


  }
}
