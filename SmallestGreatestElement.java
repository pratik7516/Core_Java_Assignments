/*27.Write a program to fine the smallest and greatest number present in the array of integer type.*/

import java.util.Scanner;

class MinMaxElement{

	public static void main (String args[]){

		Scanner sc = new Scanner(System.in);
                  	int arr[]=new int[5];

		for(int i=0;i<arr.length;i++)
		{
		 System.out.println("Enter the elements");
		  arr[i]=sc.nextInt();
		}

                                 	  int min = arr[0];
	                   int max = arr[0];
                                   
		for(int a : arr){
		System.out.print(" "+a);
		}

                                
		
		for (int i = 1; i < arr.length; i++)  
		{
			if (arr[i] > max) 
			{
				max = arr[i];
			}
			if (arr[i] < min) 
			{
				min = arr[i];
			}
		}

		System.out.println("\nLargest Number in a given array is : " + max+ " and Smallest Number in a given array is : " + min);
			
		
	}

}