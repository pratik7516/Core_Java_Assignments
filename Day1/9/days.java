import java.util.Scanner;

class main{

    public static void main(String args[]){ 
    Scanner sc=new Scanner(System.in);

    System.out.println("Enter the no of days");
    int days=sc.nextInt();
    float months=days/30.14f;
    System.out.println("no of months ="+months);

    float years=days/365f;
    System.out.println("no of years ="+years);

    }

}