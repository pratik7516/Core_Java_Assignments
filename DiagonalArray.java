/*30.Create an integer type 2-D array of size [3X3]. Take the elements from the user and then calculate the sum of the elements present in the diagonal.*/


import java.util.Scanner;
class DiagonalArray{
      public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int arr[][]=new int[3][3];
	
	for (int i=0;i<arr.length;i++){
	   for(int j=0;j<arr.length;j++){
 		System.out.print("Enter a number:");
		arr[i][j]=sc.nextInt();
		}
	} 

                  int ldiag=0;
	int  rdiag=0;
	 
	for(int i=0;i<arr.length;i++){
	  for(int j=0;j<arr.length;j++){
  	    
                        if(i==j){
		ldiag=ldiag+arr[i][j];
		rdiag=rdiag+arr[(arr.length-1)-i][j];
		}	
	               }
	}
                     
                  for(int ar[]:arr){
	for(int a : ar){
                        System.out.print(" "+a);
                   }
                 System.out.println(" ");
             }

System.out.println("\nSum of left diagonal: "+ldiag+"\nSum of right diagonal: "+rdiag+"\nSum of diagonals: "+(ldiag+rdiag));
          }
	   
}