package drn.generics;

class Employee {
	
	private int empId;
	private String empName;
	private double salary;

	public Employee() {}

	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	};
	
	public String toString() {
		return empId +"  "+empName+"  "+salary;
	}
	
	
}


