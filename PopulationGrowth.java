/*
Nate Bernstein
CS1050
March 15
This program calculates the growth or decline of a population based on user input.
*/
import java.util.Scanner;
public class PopulationGrowth{
  public static void main(String[] args){
    Scanner inp = new Scanner(System.in);
    System.out.print("Enter the initial population size [1-1000]: ");
    int p = inp.nextInt();
    System.out.print("Enter the birth rate [0.0...1.0): ");
    double b = inp.nextDouble();
    System.out.print("Enter the death rate [0.0...1.0): ");
    double d = inp.nextDouble();
    System.out.print("Enter the number of years [1...100): ");
    int time_span = inp.nextInt();
    inp.close();
    int i = 0;
    double r = b-d;
    System.out.printf("%-10s %-10s\n", "Year","Population");
    while(i<time_span){
      System.out.printf("%-10s %-10s\n", i,p);
      double n = (r*p);
      double temp = p+n;
      p = (int)temp;
      i+=1;
      if(p<1){
        System.out.printf("%-10s %-10s\n", i,p);
        System.out.println("The population has gone extinct.");
        break;
      }
    }
  }
}
