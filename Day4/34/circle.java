import java.util.Scanner;
class circle{
	private int radius;
	private int area;
	
    Scanner sc=new Scanner(System.in);
    void init(){
        System.out.println("Enter radiud");
        int r=sc.nextInt();
    }

    void area(){
        int area=(r*r);
       // System.out.println("area of circle "+area)
       //return area;
    }

	void display(){
		System.out.println(radius+" "+area);
	}
}
class EmployeeDemo3{
	public static void main(String args[]){
		circle e = new circle();
		e.init();
        e.area();
		e.display();
	}
}