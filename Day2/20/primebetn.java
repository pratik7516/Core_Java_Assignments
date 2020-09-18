class main
{

    public static void main(String args[])
    {
        int temp=0;
        for(int no=1;no<=100;no++)
        {
            for(int i=2;i<=no-10;i++)
            {
                    if(no%2==0)
                    {
                    temp=temp+1;
                    }
            }
        
        
            if(temp==0)
            {
            System.out.println(no);
            }
            else
            {
            temp=0;
            }
        }
    }
}