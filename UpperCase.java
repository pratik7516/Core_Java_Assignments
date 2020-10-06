/*
Write a program to convert very first character of every word in uppercase in a String.
*/
import java.util.Scanner;
//class {

//}

class UpperCase{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String ");
		String str = sc.nextLine();

		String arr[] = str.split(" ");

		int count=1;
		for(int i=0; i<arr.length; i++){

			System.out.print(arr[i].substring(0,1).toUpperCase()+arr[i].substring(1,arr[i].length()).toLowerCase()+" ");
		}
		//System.out.println(str);


		
	}
}