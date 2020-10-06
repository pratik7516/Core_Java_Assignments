/*31.Create a class Student with 2 data members rno and name. Create one method setData() that takes roll number and student name as parameter and stores them in data members rno and name. Create one more method showData() to print the data member values. Create another class ( main class) StudentDemo that creates Student class object and calls setData() and showData() methods.*/

import java.util.Scanner;
class Student{
	
	private int rollno;
	private String name;
	
	void setData(int rollno, String name){
	this.rollno=rollno;
	this.name=name;
		}

	void showData(){
	System.out.println(rollno+" "+name);
	      }

	}	

class StudentDemo{
public static void main(String args[]){
                         Student s =new Student();
	       s.setData(20,"Rutuja");
	       s.showData();
	        
                         Student s1=new Student();
	       s1.setData(2,"Maya");
	       s1.showData();
             
	/*Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student's name: ");
		String name = sc.nextLine();

		System.out.print("Enter roll number: ");
		int rollno = sc.nextInt();

		Student s =new Student();
		
		s.setData(rollno,name);
		s.showData();*/
	}
}