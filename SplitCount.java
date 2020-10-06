/*
Input data exactly in the following format, and print sum of all integer values. "67, 89, 23, 67, 12, 55, 66".
   (Hint use String class split method and Integer class parseInt method) .
*/
import java.util.Scanner;
//class {

//}

class SplitCount{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number in csf: ");
		String str = sc.nextLine();
		String arr[] =str.split(",");

		int sum=0;
		for(String i: arr){
			sum+=Integer.parseInt(i);
//			System.out.println(i);
		}
		System.out.println("Sum is: "+sum);

	}
}