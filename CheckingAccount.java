package week6test;

public class CheckingAccount extends BankAccount{

	private float serviceFee;
	public CheckingAccount() {
		super();
	}

	public CheckingAccount(String accountNum, float balance, float serviceFee) {
		super(accountNum,balance);
		this.serviceFee = serviceFee;
	}

	public float getServiceFee() {
		return serviceFee;
	}

	public void setServiceFee(float serviceFee) {
		this.serviceFee = serviceFee;
	}

	public void assessServiceFee() {
		super.setBalance(super.getBalance()-this.serviceFee);
	}
	
	public String toString() {
		return "banance="+super.getBalance();
	}
	public void updateBalance() {
		super.setBalance(super.getBalance()-this.serviceFee);
	}
	
}
