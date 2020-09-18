import java.util.Scanner;

class main
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of temp in faren");
    float temp=sc.nextFloat();

    float celsius=5*(temp - 32)/9;

    System.out.println("temp in celcious is "+celsius);
     }
}