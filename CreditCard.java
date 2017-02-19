/* Written By Alaa Nafea
 * Purpose: Practice programming using classes.
 * This was not for a class and was for me 
 * to develop a greater understanding for classes
 */

public class CreditCard 
{
	//define instance variables
	private String name;
	private double initialBalance;
	private double limit;
	private String account;
	private String bankType;
	private double balance;
	
	//constructor for the CreditCard class
	public CreditCard(String nam, double bal, double max, String accountNumber, String bank)
	{
		name = nam;
		initialBalance = bal;
		limit = max;
		account = accountNumber;
		bankType = bank;
		balance = bal;
	}
	
	//function to get the name of the account
	public String getName()
	{
		return name;
	}
	
	//function to get account number
	public String getAccountNumber()
	{
		return account;
	}
	
	//function to get account limits
	public double getLimit()
	{
		return limit;
	}
	
	//function to get bank type 
	public String getBankName()
	{
		return bankType;
	}
	
	//function to get the account balance
	public double getBalance()
	{
		return balance;
	}
	
	//function to add money
	public double addMoney(double ammt)
	{
		balance += ammt;
		return balance;
	}
	
	//function to spend money
	public double spendMoney(double ammt)
	{
		balance -= ammt;
		return balance;
	}
	
	//function to check the limit of the account
	public boolean checkLimit()
	{
		if (balance < limit)
		{
			System.out.println("Limit exceeded, proceed with caution.");
			return false;
		}
		else if (balance > limit)
		{
			System.out.println("Balance: " + balance + "Limit: " + limit);
			return true;
		}
		else
		{
			System.out.println("ALERT: Account is at the limit:");
			return true;
		}
		
	}
	
	

	
	
	
	
	
}
