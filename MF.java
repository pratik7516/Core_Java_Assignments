/*15.Accept person’s gender (character m for male and f for female), age (integer), as input and then check whether person is eligible for marriage or not.*/


import java.util.Scanner;

class Marriage
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);

System.out.println("Enter age");
int age=sc.nextInt();

System.out.println("Enter gender: M/F");
int gender=sc.next().charAt(0);


if(gender == 'M')
{
           if(age >= 21){
         System.out.println("You are eligible for marriage");
           }
          else{
               System.out.println("You are not eligible for marriage");
            }
}

if(gender == 'F')
{
           if(age >= 21){
         System.out.println("You are eligible for marriage");
           }
          else{
               System.out.println("You are not eligible for marriage");
            }
}


}
}