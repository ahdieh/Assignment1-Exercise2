
public class BankAccount {
	private String _accountNumber;
	private String _ownersName;
	private double _balance;
	
	
	// PROPERTIES +++++++++++++++++++++++++++++++++++++++++++++++
			public String getAccountNumber() {
				return this._accountNumber;
			}

			public void setAccountNumber(String accountNumber) {
				this._accountNumber = accountNumber;
			}
			
			public String getOwnersName() {
				return this._ownersName;
			}
			
			public void setOwnersName(String ownersName) {
				this._ownersName = ownersName;
			}
			
			public double getBalance() {
				return this._balance;
			}
			public void setBalance(double balance) {
				this._balance = balance;
			}
			
			@SuppressWarnings("unused")
			private void _initialize(String accountNumber, String ownersName , double balance) {
				this.setAccountNumber(accountNumber);
				this.setOwnersName(ownersName);
				this.setBalance(balance);
			}
			public void Deposit(double myDeposit){
				this._balance = this._balance + myDeposit;
				System.out.printf("Your balance after deposting is: $%.2f",this._balance);
				System.out.println();
			}
			
			public void Withdraw(double myWithdraw){
				this._balance = this._balance - myWithdraw;
				System.out.printf("Your balance after withdrawing is: $%.2f",this._balance);
				System.out.println();
			}
			
			public  void getAccountInfo () {
				System.out.printf("***Account Number: %s%n***Name: %s%n***Balance: $%.2f%n",
						this._accountNumber, this._ownersName, this._balance);
			}
}
