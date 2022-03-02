/*
Nate Bernstein
March 2
Worksheet 5
CS1050

7. Write a program to display a menu (as given below) and prompt the user to choose from the menu (Enter numbers 1 to 5). The user choice should be accepted in variable choice which is initialized to 0. Accept only numbers 1 to 5 for any other entry show the menu again and prompt for the correct entry. Show the menu until the user enters 5 to exit from the program.

1.Circle

2.Square

3.Rectangle

4.Triangle

5.Exit

Based on the user's selection, print the choice. For example, if the user chooses 2, print “The choice is Square”. You can use any constructs we discussed in class.*/
import java.util.Scanner;
public class Worksheet5_7{
  public static void main(String[] args){
    Scanner inp = new Scanner(System.in);
    boolean stayin = true;
    while (stayin){
      System.out.println("\nPlease choose from the menu(1-5)\n");
      System.out.println("1. Circle\n");
      System.out.println("2. Square\n");
      System.out.println("3. Rectangle\n");
      System.out.println("4. Triangle\n");
      System.out.println("5. Exit\n");
      int userIn = inp.nextInt();
      switch(userIn){
        case 1:
            System.out.println("The choice is Circle.");
            break;
        case 2:
            System.out.println("The choice is Square.");
            break;
        case 3:
            System.out.println("The choice is Rectangle.");
            break;
        case 4:
            System.out.println("The choice is Triangle.");
            break;
        case 5:
            System.out.println("The choice is Exit, goodbye!");
            stayin = false;
            break;
      }
    }
    inp.close();

  }
}
