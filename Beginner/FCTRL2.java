import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.BigInteger;

class CodeChef{
	
	public static void main(String[] args) throws java.lang.Exception
	{
		try{
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
	//	scanner.nextLine();
		int num;
		
		
		for(int i=0;i<t;i++){
			num = scanner.nextInt();
			BigInteger fact = new BigInteger("1");
			
			while(num > 0){
				fact = fact.multiply(BigInteger.valueOf(num));
				num -= 1;
			}
			System.out.println(fact);
			
		}
		} catch(Exception e){}
	}
}