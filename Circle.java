/*06.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. Then calculate and print the area and circumference of the circle.*/

import java.util.Scanner;
class Circle{
      public static void main(String args[]){

      Scanner sc = new Scanner(System.in);
       
      float radius  = sc.nextFloat();
       
      float result = 3.14F*(radius * radius);
       System.out.println(result);
     }
}