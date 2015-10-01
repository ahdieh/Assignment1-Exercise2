
public class BankAccount {
	
	// PRIVATE INSTANCE VARIABLES ++++++++++++++++++++++++++++++++++++++
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
			
	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++
     public BankAccount(){
			this._initialize("Unknowm", "Unknowm",0.0);

    }
     
	// PRIVATE METHODS ++++++++++++++++++++++++++++++++++++++

	 private void _initialize(String accountNumber, String ownersName , double balance) {
			this.setAccountNumber(accountNumber);
			this.setOwnersName(ownersName);
			this.setBalance(balance);
	 }
	 
	// PUBLIC METHODS +++++++++++++++++++++++++++++++++++++++++
	public void Deposit(double myDeposit){
			this._balance = this._balance + myDeposit;
			System.out.printf("Your balance after deposting is: $%.2f \n",this.getBalance());
			System.out.println();

    }
			
	public void Withdraw(double myWithdraw){
	 		this._balance = this._balance - myWithdraw;
			System.out.printf("Your balance after withdrawing is: $%.2f",this.getBalance());
			System.out.println();

	}
			
	public  void getAccountInfo () {
		    System.out.println();
	    	System.out.printf("***%s's Account Information:	\n",this.getOwnersName());
	    	System.out.println();

	}
}
