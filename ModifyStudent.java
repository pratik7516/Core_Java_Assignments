/*32.Modify the above program (no. 30) to count the no of Student objects created. [ In this program static variable is required ]*/

import java.util.Scanner;
class Student{
	
	private int rollno;
	private String name;
	private static int objCount;
	
	void setData(int rollno, String name){
	this.rollno=rollno;
	this.name=name;
	ObjCounter();
		}

	void ObjCounter(){
	    objCount++;
		}

                    int getObjCounter(){
	  return objCount;
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
	      
	       Student s2=new Student();
	       s2.setData(3,"Aaru");
	       s2.showData();

	       System.out.println("object counter: "+s2.getObjCounter());
             
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