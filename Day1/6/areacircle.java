import java.util.Scanner;
class main{

public static void main(String args[])
{
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the value of radius");
        int r=sc.nextInt();
        float A=(3.14f)*r*r;
        float c=2*(3.14f)*r;
        System.out.println("area of circle is= "+A);
        System.out.println("circumference of circle is= "+c);
}

}