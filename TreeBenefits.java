/*
Nate Bernstein
CS1050
April 11
*/
import java.util.Scanner;
import java.lang.Math;
public class TreeBenefits{
  public static void main(String[] args){
    double[] height= new double[10];
    double[] diameter= new double[10];
    double[] greenW= new double[10];
    double[] carbon= new double[10];
    double[] co2= new double[10];
    String temp;
    int tempint;
    boolean err = false;
    Scanner inp = new Scanner(System.in);
    for(int i = 0;i<10;i++){
      err = false;
      System.out.print("Enter the height <space> diameter, both in cm: ");
      temp = inp.nextLine();
      tempint = temp.indexOf(" ");
      height[i] = Double.parseDouble(temp.substring(0,tempint));
      if(height[i]<=30.48){
        System.out.println("*** ERROR: The height must be greater than 30.48 cm. Please try again.");
        err = true;
      }
      diameter[i] = Double.parseDouble(temp.substring(tempint));
      if(diameter[i]<=2.0){
        System.out.println("*** ERROR: The diameter must be greater than 2.0 cm. Please try again.");
        err = true;
      }
      if(err==true){
        i-=1;
        continue;
      }
      if(diameter[i]<28.0){
        greenW[i] = (0.0577*height[i]*(diameter[i]*diameter[i]));
      }
      else{
        greenW[i] = (0.0346*height[i]*(diameter[i]*diameter[i]));
      }
      carbon[i] = (greenW[i]*.25);
      co2[i]= (carbon[i]*3.67);
    }
    System.out.println("");
    System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "Height","Diameter","Green Weight","Carbon","CO2");
    System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "------","--------","------------","-----","---");
    double total = 0;
    for(int v=0;v<10;v++){
      System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", (Math.round(height[v]*100.0)/100.0),(Math.round(diameter[v]*100.0)/100.0),(Math.round(greenW[v]*100.0)/100.0),(Math.round(carbon[v]*100.0)/100.0),(Math.round(co2[v]*100.0)/100.0));
      total+=co2[v];
    }
    System.out.printf("%-30s %-30s\n", "","Total CO2 = "+Math.round(total*100.0)/100.0);
    inp.close();
  }
}
