import java.util.Scanner;
public class Feb7{
  public static void main(String[] args){
    int num1 = 8;
    double dec1 = 2.56;
    num1 = (int)dec1*num1;
    System.out.println(num1);

    float g=3.14485f;
    System.out.println("Original number: "+g);
    System.out.print("To two decimal points: ");
    System.out.printf("%.2f%n",g);
    System.out.print("To 1 decimal point: ");
    System.out.printf("%.1f%n",g);

    String words;
    int number;
    Scanner input = new Scanner(System.in); //NOTE: "input" can be named anything
    System.out.print("Introduce your number: ");
    words = input.nextLine(); //Accepts a string ***IF USED ON LAST LINE BEFORE CLOSE WILL NOT ACCEPT INPUT***
    System.out.print("What's the first number?: ");
    number = input.nextInt(); //how to properly accept an int as an input
    System.out.println(words + ": " + (number*2));
    input.close();
    }
}
