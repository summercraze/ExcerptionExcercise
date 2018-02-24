import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.InputMismatchException;

public class sumMismatch 
{
	public static void main(String[] args)
	{
		//open input for user input later
		Scanner input = new Scanner(System.in);
		
		//randomly pick up 2 numbers and figure their sum
		int integer1 = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		int integer2 = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		int sum = integer1 + integer2;
		
		//boolean to continue try for number
		boolean continueInput = true;
		
		//while loop to continue ask for sum if the input is wrong
		do
		{
			//try and catch the exception
			try
			{
				//ask for sum input
				System.out.println("What is the sum of " + integer1 + " and " + integer2 + "?");		
				int responseSum = input.nextInt();
				
				//check whether the sum is correct mathmatically if it is wrong will continue asking
				if(responseSum != sum)
				{
					System.out.println("The answer is not right,try again.");
					input.nextLine();
					continueInput = true;
				}
				else
				{
					System.out.println("Correct!");
					continueInput = false;
				}
			}
			catch(InputMismatchException ex)
			{
				System.out.println("An integer input is required, try again.");
				input.nextLine();
			}
			
		}while(continueInput);

	}
}
