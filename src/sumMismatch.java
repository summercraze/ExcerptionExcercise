import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.InputMismatchException;

public class sumMismatch 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int integer1 = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		int integer2 = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		int sum = integer1 + integer2;
		boolean continueInput = true;
		do
		{
			try
			{
				System.out.println("What is the sum of " + integer1 + " and " + integer2 + "?");		
				int responseSum = input.nextInt();
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
