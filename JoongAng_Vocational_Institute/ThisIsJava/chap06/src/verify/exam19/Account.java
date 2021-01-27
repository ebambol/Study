package verify.exam19;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	private int balance;
	
	public void setBalance(int balance){
		if(MIN_BALANCE<=balance && balance <= MAX_BALANCE) {
			this.balance = balance;
		} else {
			System.out.println("¹üÀ§°¡ ¾Æ´Ô");
			return;
		}
	}
	public int getBalance() {
		return this.balance;
	}
}
