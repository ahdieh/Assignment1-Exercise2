import java.util.Scanner;


public class Program  {
	public static BankAccount bankAccount; // reference to the Person class
	public static void main(String[] args) {
		System.out.println("Program Started...");
		@SuppressWarnings("resource")
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
		
		// Prompt user for Deposit
		System.out.print("Enter the ammount of Deposit: ");
		Double myDeposit = input.nextDouble();
		
		// Prompt user for Withdraw
				System.out.print("Enter the ammount of Withdraw: ");
				Double myWithdraw = input.nextDouble();
				
			
		
				bankAccount = new BankAccount();
		
				bankAccount.setAccountNumber(myAccountNumber);
				bankAccount.setOwnersName(myOwnersName);
				bankAccount.setBalance(myBalance);
				bankAccount.Deposit(myDeposit);
				bankAccount.Withdraw(myWithdraw);
				
				
		
			
		
				System.out.println("Your Account information is: ");
				
				bankAccount.getAccountInfo();
		
	}

}