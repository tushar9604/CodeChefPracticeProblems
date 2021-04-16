import java.util.*;
import java.lang.*;
import java.io.*;

class CodeChef{
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		scanner.nextLine();
		String n;
		
		for(int i=0;i<t;i++){
			n = scanner.nextLine();
			int len = n.length();
			int last_digit = Integer.parseInt(n)%10;
			int tens = (int)Math.pow(10,(len-1));
			int first_digit = Integer.parseInt(n)/(tens);
			System.out.println(first_digit + last_digit);
		}
	}
}