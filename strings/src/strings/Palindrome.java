package strings;
import java.util.Scanner;
public class Palindrome{
	
	static String input;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Palindrome Word");
		input = scan.nextLine();
		boolean a = palindrome(input);
		System.out.println(a);	
	}
	 public static boolean palindrome( String in){		
		 in= in.replace(" ", "");
		 System.out.println(in);
		 in= in.toUpperCase();
		 String s = in;
		 char g = 0;
		 char d = 0;
		 
//		 right side
		 for(int i = 0; i<s.length(); i++){
			 g = s.charAt(i);
		 }
		 
//       left side 
		 
		 for(int i = s.length()-1; i>=0; i--){
			 d = s.charAt(i);
		 }
		if (g==d){
			 System.out.println("Correct");
		 return true;	
		}
		 else
			 return false;
	 }
}
	//todo: Create a method isPalindrome which takes a String as input and returns true if it is a palindrome and false otherwise.
	//A palindrome is a word which can be read backwards and forwards in the same way., e.g. 'hannah'.
	//Ignore upper and lower case. 'Hannah' is a palindrome, too.
	//Ignore also spaces. 'Taco cat' is a valid palindrome.

