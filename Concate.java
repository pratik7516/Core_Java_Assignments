/*07.	Write a program to calculate sum of 5 subject’s marks & find percentage. Take the obtained marks from user using Scanner class. Output should be in this format [ percentage marks = 99 % ]. Use concatenation operator here.*/

import java.util.Scanner;
class Concate{
       
    public static void main (String args[]){
        
     Scanner sc = new Scanner (System.in);
      System.out.println("Enter OS marks:");
      int  os =sc.nextInt();
      System.out.println("Enter DBT marks:");
      int  db =sc.nextInt();
      System.out.println("Enter DS marks:");
      int  ds =sc.nextInt();
      System.out.println("Enter CPP marks:");
      int  cpp =sc.nextInt();
      System.out.println("Enter AWE marks:");
      int  awe =sc.nextInt();
      int total=500;
      int sum = os+db+ds+cpp+awe;
      float res = (float)sum/total;

      float per= res*50;
     
      System.out.println("percentage marks = " + per + "%");
      }
}