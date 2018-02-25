/*
 * This is a code that modify the Loan class in Listing 10.2
 * It will throw an exception when the loan amount,interest rate and number of year is less or equal to zero
 * the method modified are the setter and constructor with parameter
 * setter would throw an exception when the loan amount,interest rate and number of year is less or equal to zero
 * else it would change the amount 
 * the constructor is changed to using the setter
 */

public class Loan 
{
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/** Default constructor */
	public Loan()
	{
		this(2.5,1,1000);
	}
	/** Construct a loan with specified annual interest rate,number of years, and loan amount*/
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount) 
	{
		//change to setter method in order to check for exception
		setAnnualInterestRate(annualInterestRate);
		setNumberOfYears(numberOfYears);
		setLoanAmount(loanAmount);
		loanDate = new java.util.Date();
	}
	
	/** Return annualInterestRate */ 
	public double getAnnualInterestRate() 
	{ 
		return annualInterestRate;
	}
	
	/** Set a new annualInterestRate */ 
	public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException
	{ 
		if(annualInterestRate >= 0)
			this.annualInterestRate = annualInterestRate;
		else 
			throw new IllegalArgumentException("Interest rate cannot be negative.");
	}
	
	/** Return numberOfYears */ 
	public int getNumberOfYears() 
	{ 
		return numberOfYears;
	} 
	
	/** Set a new numberOfYears */
	public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException
	{ 
		if(numberOfYears >= 0)
			this.numberOfYears = numberOfYears;
		else
			throw new IllegalArgumentException("Number of years cannot be negative.");
	} 
	
	/** Return loanAmount */
	public double getLoanAmount() 
	{ 
		return loanAmount;
	} 
	
	/** Set a new loanAmount */
	public void setLoanAmount(double loanAmount) throws IllegalArgumentException
	{ 
		if(loanAmount >= 0)
			this.loanAmount = loanAmount;
		else
			throw new IllegalArgumentException("Loan amount cannot be negative.");
	} 
	
	/** Find monthly payment */ 
	public double getMonthlyPayment() 
	{
		double monthlyInterestRate = annualInterestRate / 1200; 
		double monthlyPayment = loanAmount * monthlyInterestRate / (1- (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}
	
	/** Find total payment */ 
	public double getTotalPayment() 
	{
		double totalPayment = getMonthlyPayment() * numberOfYears * 12; 
		return totalPayment;
	} 
	
	/** Return loan date */
	public java.util.Date getLoanDate() 
	{ 
		return loanDate;
	}
}


