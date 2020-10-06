/*03.Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
*/

class PrimitiveDatatype{
     public static void main(String args[]){
     int x=2;
     int y=x^2 +3*x-7;
     int z=x++ + ++x;
     System.out.println(y);
     System.out.println(x);
     System.out.println(z);
      }
}

class PrimitiveDatatype1{
     public static void main(String args[]){
     int x=2;
     int y=x++ + ++x;
     System.out.println(x);
     System.out.println(y);
      }
}

class PrimitiveDatatype2{
     public static void main(String args[]){
     int x=6;
     int y=4;
     int z=x++ - --y - --x  +  x++;
     System.out.println(x);
     System.out.println(y);
     System.out.println(z);
      }
}

class PrimitiveDatatype3{
     public static void main(String args[]){
     boolean x=true;
     boolean y=false;
     boolean z=x && y || !(x || y) ;
     System.out.println(x);
     System.out.println(y);
     System.out.println(z);
      }
}


