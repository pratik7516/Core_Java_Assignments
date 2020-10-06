/*26.Create an array of 17 elements in 5 rows.  And calculate sum of all elements.*/

import java.util.Scanner;
class SumOfElement{
                    public static void main(String args[]){
	                Scanner sc = new Scanner(System.in);

		System.out.println("Enter rows");
		int r=sc.nextInt();

		int arr [ ] [ ] =new int [r] [ ];
		int sum=0;

		for(int i=0;i<arr.length;i++){
			System.out.println("Enter no. of columns:");
			int c = sc.nextInt();
			arr[i]=new int [c];
				for(int j=0;j<arr[i].length;j++){
			 	System.out.println("Enter elements");
				 arr[i][j]=sc.nextInt();
				  
					}

				        }
		for(int ar[]:arr){
			for(int a:ar){
			System.out.print(" "+a);
                                                    sum = sum+a;
			
			}
		
		System.out.println(" ");
		}
                                System.out.println("Sum of the elements in array is "+sum);
	  }
          }