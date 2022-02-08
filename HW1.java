// HW1 Assignment
// Author: Nate Bernstein
// Date:   02/07/2022
// Class:  CS1050 Spring 2022
// Email:  nbernst3@msudenver.edu

public class HW1 {
    public static void main(String[] args) {
        String firstName = "Nate"; //Define 3 strings, with my full name and my major
        String lastName = "Bernstein";
        String major = "Computer Science";
        double x = 3.05; //define two variables with type double, allowing them to accept numbers with decimal points
        double y = 2.5;
        System.out.println("Programming is thinking \"Not\" Typing."); //use the backslash as an escape character, allowing " to be used
        System.out.println(lastName + ", " + firstName); //print lastName and firstName with a comma and a space between
        System.out.println(major); //print the variable major
        System.out.println(1234*2); //multiply 1234 by 2, then print
        System.out.println("The product of 2 decimal numbers is "+(x*y)+"."); //multiply x and y and add a print statement describing it
        System.out.println("CS1050 \\ Java"); //Use the backslash escape character to be able to use backslash in the print
        System.out.println("I am in this class because I love to program, and I want to increase the depth of my Javascript knowledge.");
    }
} //program ends
