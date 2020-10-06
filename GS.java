/*12.In a company an employee is paid as under: If his basic salary is less than Rs. 10000, then HRA = 10% of basic salary and DA = 90% of basic salary. If his salary is either equal to or above Rs. 10000, then HRA = Rs. 2000 and DA = 98% of basic salary. If the employee's salary is input by the user write a program to find his gross salary. [ formula : GS= Basic + DA + HRA ]*/

import java.util.Scanner;

class EmpSal{
       
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
 int sal = sc.nextInt();

if (sal < 10000){
   float hra = 0.10F * sal;
   float da = 0.90F *sal;

 float grs = sal + da +hra;

System.out.println(grs);
}

else{
float hra = 2000F;
   float da = 0.98F *sal;

 float grs = sal + da +hra;

System.out.println(grs);
}
    }
}