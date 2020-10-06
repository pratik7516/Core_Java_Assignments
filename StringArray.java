/*28.Initialize one String type of array and print the elements using for each loop.*/

import java.util.Scanner;
class StringArray{
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. words to be print in array:");
                                   int num=sc.nextInt();
		
		String[] names=new String[num];
	
		for(int i=0;i<num;i++){
		System.out.println("Enter the name");
		names[i]=sc.next();
   		}

		for(String a : names){
		System.out.print(" "+a);
                                     }
			
	}
}