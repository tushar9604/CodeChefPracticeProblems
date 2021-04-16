import java.io.*;
import java.util.*;
import java.lang.*;

class CodeChef{
	
	public static void main(String[] args) throws java.lang.Exception{
		
		try{
			Scanner scanner = new Scanner(System.in);
			int t = scanner.nextInt();
			scanner.nextLine();
			//int n;
			
			for(int i=0;i<t;i++){
				StringBuilder n = new StringBuilder(scanner.nextLine());
				String nn = new String(n.reverse());
				System.out.println(Integer.parseInt(nn));
				
			}
			
		} catch (java.lang.Exception e){}
	}
}

/*


import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
		    int num=sc.nextInt();
		    int rev=0,rem=0;
		    while(num>0){
		        rem=num%10;
		        rev=(rev*10)+rem;
		        num/=10;
		    }
		    System.out.println(rev);
		}
	}
}
*/