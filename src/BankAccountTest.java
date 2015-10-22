import java.util.Scanner;


public class BankAccountTest  {
	public static BankAccount bankAccount; // reference to the Person class
	public static void main(String[] args) {
		System.out.println("Account transactions...");
		Scanner input = new Scanner(System.in);
		
		// Prompt user for Account Number
		System.out.print("Enter your Account Number: ");
		String myAccountNumber= input.nextLine();
		
		// Prompt user for Owners'name
		System.out.print("Enter your Name: ");
		String myOwnersName= input.nextLine();
		
		// Prompt user for Balance
		System.out.print("Enter your Initial Balance: ");
		Double myBalance= input.nextDouble();
		
				
		
		bankAccount = new BankAccount();
		
		bankAccount.setAccountNumber(myAccountNumber);
		bankAccount.setOwnersName(myOwnersName);
		bankAccount.setBalance(myBalance);
		
		// Prompt user for Deposit
		System.out.print("Enter the ammount of Deposit: ");
		Double myDeposit = input.nextDouble();
		bankAccount.Deposit(myDeposit);
		
		// Prompt user for Withdraw
		System.out.print("Enter the ammount of Withdraw: ");
		Double myWithdraw = input.nextDouble();
		bankAccount.Withdraw(myWithdraw);
	
			
		bankAccount.getAccountInfo();
		
		System.out.printf("After transaction %s with the Account#%s has $%.2f.",bankAccount.getOwnersName(),bankAccount.getAccountNumber(),bankAccount.getBalance());

		
		
	}

}