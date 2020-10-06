/*
Input name of a person and count how many vowels it contains.
  Use String class functions
*/
import java.util.Scanner;
//class {

//}

class NameVowels{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next().toLowerCase();
		
		int count=0;
		for(int i=0; i<name.length(); i++){
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u'){
				count++;
			}
		}

		System.out.println("Count of vowels is: "+count);
	}
}