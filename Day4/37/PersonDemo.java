class person{
	private int age;
	private String name;
	person(int age){		
		this(100,"pratik");
		//System.out.println("no arg");
	}
	person(int age,String name){
		
		this.age = age;
		this.name = name;
		//System.out.println("param arg");
	}
	void show(){
		System.out.println(age+" "+name);
	}
}
class EmployeeDemo4{
	public static void main(String args[]){
		
		person e = new person(18);
		e.show();
		
	}
}