import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CodeChef{
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		int t = scanner.nextInt();
		scanner.nextLine();
		String n;
		Pattern pattern = Pattern.compile("4");
		for(int i=0;i<t;i++){
			n = scanner.nextLine();
			Matcher matcher = pattern.matcher(n);
			int count = 0;
			while(matcher.find()){
				count++;
			}
			
			
			System.out.println(count);
		}
	}
}
		
/*
import java.util.*;
import java.lang.*;
import java.io.*;
class code_chef {

	public static void main(String[] args) throws java.lang.Exception
	 {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r;
		for(int i = 1;i<=n;i++)
		{
			int a = sc.nextInt();
			int digit = 0;
			while(a!=0)
			{
				r=a%10;
				a=a/10;
				if(r==4)
					digit++;
			}
			System.out.println(digit);
		}

	}

}
*/		