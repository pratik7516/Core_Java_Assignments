import java.util.Scanner;
class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int no =sc.nextInt();

        for(int i=1; i<=10; i++)
        {

            System.out.println(no+" * "+i+" = "+no*i);
        }
    }
}