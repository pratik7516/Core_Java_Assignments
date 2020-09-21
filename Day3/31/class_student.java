class student{
	private int rno;
	private String name;
	void set(int rno,String name){
		//System.out.println("this = "+this);
		this.rno = rno;
		this.name = name;
	}
	void show(){
		System.out.println(rno+" "+name);
	}
}
class student_d{
	public static void main(String args[]){
		student e = new student();
		//System.out.println("e = "+e);
		e.set(10,"ram");
		e.show();
		//Employee e1 = new Employee();
		//System.out.println("e1 = "+e1);
		//e1.set(102,"shiv");
		//e1.show();
	}
}