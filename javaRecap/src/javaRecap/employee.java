//DRY = Do not Repeat YourSelf
//S.O.L.I.D
//S — Single Responsibility Principle (SRP)
//O — Open/Closed Principle (OCP)
//L — Liskov Substitution Principle (LSP)
//I — Interface Segregation Principle (ISP)
//D — Dependency Inversion Principle (DIP)

//OOPS 
//Encapsulation => private variable + public method

package javaRecap;

public class employee {
	
	static int idCounter = 0;
	private int empId ;
	private String empName;
	private String empDept;
	private double empSalary;
	
	public employee(String empName, String empDept, double empSalary) {
		this.empId = ++idCounter;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empDept = empDept;
	}
	
	public void showEmployee() {
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(empDept);
		System.out.println(empSalary);
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	
}
