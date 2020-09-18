import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of the principal amount");
       int p =sc.nextInt();

       
        System.out.println("enter the value of the rate");
       int r =sc.nextInt();

       
        System.out.println("enter the value of time");
       int t =sc.nextInt();

        int SI = p*r*t;

        System.out.println(" the SI is "+SI);
       

    }
}