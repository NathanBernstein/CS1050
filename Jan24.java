import java.util.Scanner;

public class Jan24
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("What's the first number?: ");
    int number = Integer.parseInt(input.nextLine());
    System.out.print("What's the second number?: ");
    int number1 = Integer.parseInt(input.nextLine());
		input.close();
		System.out.println("Your two numbers added equal: " + (number+number1));
    System.out.println("Your two numbers subtracted equal: " + (number-number1));
    System.out.println("Your two numbers multiplied equal: " + (number*number1));
  	System.out.println("Your two numbers divided equal: " + (number/number1));
	}
}
