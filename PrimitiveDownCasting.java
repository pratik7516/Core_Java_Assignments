/*04.Write a program that initializes 2 byte type of variables. Add the values of these variables and store in a byte type of variable. [Note: primitive down casting is required in this program ] .*/

class DownCasting{
    public static void main(String args[]){
   byte b1=10;
   byte b2=20;
   int k = (b1 + b2);
   System.out.println((byte)k);   
     
  }
}