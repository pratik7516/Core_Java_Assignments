/*
Write a program to reverse every word of the String.
*/
import java.util.Scanner;
//class {

//}

class ReverseWord{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String ");
		String str = sc.nextLine();


		//StringBuilder sbr = new StringBuilder(str);

		String arr[] = str.split(" ");

		for(int i=0; i<arr.length; i++){
			StringBuilder sbr = new StringBuilder(arr[i]);
			System.out.print(sbr.reverse()+" ");
			
		}


		
	}
}