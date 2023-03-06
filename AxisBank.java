package week3.day1;

public class AxisBank extends BankInfo{
	
	public void deposit() {
		System.out.println("Deposit:50,000");
	}
	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.saving();
		obj.fixed();
		obj.deposit();
	}

}
