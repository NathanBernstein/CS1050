/*
Nate Bernstein
March 2
Worksheet 5
CS1050

8. Challenge question (optional) – 5 points extra

Modify question 6, the Meal finder program that ensures items purchased are evenly divisible by the number of diners.
Inputs:

 System.out.print("Enter money for meal: ");

userMoney = scnr.nextInt();

System.out.print("How many people are eating: ");

numDiners = scnr.nextInt();

  Sample Output:

Enter money for meal: 54

How many people are eating: 2

$54 buys 18 empanadas and 0 tacos without change.

$54 buys 10 empanadas and 6 tacos without change.

$54 buys 2 empanadas and 12 tacos without change.*/

import java.util.Scanner;
public class Worksheet5_8{
  public static void main(String[] args){
    Scanner scnr = new Scanner(System.in);
    final int EMPANADA_COST = 3;
    final int TACO_COST = 4;
    int userMoney,numTacos,numEmpanadas,mealCost,maxEmpanadas,maxTacos,numDiners;
    numTacos = 0;
    numEmpanadas = 0;
    mealCost = 0;
    System.out.print("Enter money for meal: ");
    userMoney = scnr.nextInt();
    System.out.print("How many people are eating: ");
    numDiners = scnr.nextInt();
    maxEmpanadas = userMoney/EMPANADA_COST;
    maxTacos = userMoney/TACO_COST;
    for (numTacos = 0; numTacos <= maxTacos; numTacos+=numDiners){
      for(numEmpanadas = 0; numEmpanadas <= maxEmpanadas; numEmpanadas+=numDiners){
        mealCost = (numEmpanadas*EMPANADA_COST) + (numTacos*TACO_COST);
        if(mealCost == userMoney){
          break;
        }
      }
      if(mealCost == userMoney){
        break;
      }
    }
    if (mealCost == userMoney){
      System.out.println("$"+mealCost+" buys "+numEmpanadas+" empanadas and "+numTacos+" tacos without change");
    }
    else{
      System.out.println("You cannot buy a meal without having change left over.");
    }
    scnr.close();
  }
}
