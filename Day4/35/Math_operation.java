class JavaExample
{
    static int add(int num1, int num2)
    {
        return num1+num2;
    }
    int sub(int num1, int num2)
    {
        return num1-num2;
    }
    int mult(int num1, int num2)
    {
        return num1*num2;
    }
    int pw(int num1, int num2)
    {
        return num1^num2;
    }
    public static void main(String[] args) 
    {    
    	JavaExample obj = new JavaExample();
        System.out.println("Sum of two numbers: "+obj.add(10, 20));
        System.out.println("Sum of three numbers: "+obj.sub(10, 20));
        System.out.println("Sum of four numbers: "+obj.mult(20,  10));
        System.out.println("Sum of four numbers: "+obj.pw(1,  2));
    }
}