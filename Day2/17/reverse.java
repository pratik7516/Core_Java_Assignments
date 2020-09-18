import java.util.Scanner;
class Reverse_Number 
{
    public static void main(String args[])
    {
        int m, n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        m = s.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum * 10 + n;             //32
            m = m / 10;    //for shipting the no
        }
        System.out.println("Reverse:"+sum);
    }
}
