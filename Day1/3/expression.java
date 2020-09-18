import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        int x=10;
        int y = x*x + 3*x-7;
        System.out.println(y);

        int y1=x++ + ++x;
        System.out.println(y1);
        System.out.println(x);

        int z1=x++ - --y - --x + x++;
        System.out.println(z1);
        System.out.println(y);
        System.out.println(x);

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the values of true and false of B1 and B2");
        
        boolean B1=sc.nextBoolean;
        boolean B2=sc.nextBoolean;

        boolean z2= B1 && B2 || !(B1 || B2);
        System.out.println("value of z ="+z2);

        
    }
}