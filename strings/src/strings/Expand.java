package strings;

import java.util.Scanner;

public class Expand {  
	static String input;
	static char c;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter String");
		input = scan.nextLine();
		char a = Expandstring(input);
		System.out.println(a);
	}	
	
	public static char Expandstring(String a){
	String pot="0";
	for(int i=0;i<input.length();i++){
		c=input.charAt(i);
		if(Character.isDigit(c)){
			pot=pot+c;
        }
		else{
        	int n=Integer.parseInt(pot);
        	if(n==0){
        		System.out.print(c);
        		}
        	else{
        		for(int j=0;j<n;j++){
        		System.out.print(c);
        	    }
        	}       	
        	pot="0";
        }
	}
	return c;
	} 
}
		//todo: take as an input a combination of characters and numbers (e.g. 2a3b5c)
		//expand the String by printing each letter so many times as the number before the letter indicates
		//e.g. 2a3b5c -> aabbbccccc
		//Hint: first start with inputs where there is always a number and then a character, then think about how
		//to improve your code such that you can use values greater or equal 10, eg. 10a13b22c
		//Further modification: if a character should only be printed one time you don't need to write any number infront of that character
		//e.g. a3b12cd5e -> abbbccccccccccccdeeeee  
		

