//Relationship
//IS-A => inheritance
//HAS_A => Aggregation

package javaRecap;

class Account{
	int acc_no;
	void departmentLimit() {
		System.out.println("Deposit limit is 5000");
	}
	
	void withdrawLimit() {
		System.out.println("Withdraw limit is 50000");
	}
	
}

class Saving extends Account{
	
	@Override
	void departmentLimit() {
		System.out.println("Deposit limit is 50000");
	}
	
	void withdrawLimit() {
		System.out.println("Withdraw limit is 50000");
	}
	
}

class Current extends Account{
	
}

public class SalaryAccount {

	public SalaryAccount() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
