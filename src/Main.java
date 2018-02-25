
public class Main 
{
	public static void main(String[] args)
	{
	 try
	 {
		 Loan l1 = new Loan(3.4,2,1000);
		 Loan l2 = new Loan(-3.4,2,-1000);
	 }
	 catch(IllegalArgumentException ex)
	 {
		 System.out.println(ex);
	 }
	}
}
