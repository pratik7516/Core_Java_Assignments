class Employee{
	private int empId;
	private String empName;
	void set(int empId,String empName){
		System.out.println("this = "+this);
		this.empId = empId;
		this.empName = empName;
	}
	void show(){
		System.out.println(empId+" "+empName);
	}
}
class EmployeeDemo{
	public static void main(String args[]){
		Employee e = new Employee();
		System.out.println("e = "+e);
		e.set(10,"ram");
		e.show();
		Employee e1 = new Employee();
		System.out.println("e1 = "+e1);
		e1.set(102,"shiv");
		e1.show();
	}
}