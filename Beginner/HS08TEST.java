import java.util.*;
import java.lang.*;
import java.io.*;

class HS08TEST	
{
	
	
	public static void main(String[] args) throws Exception
	{
		try
		{
			Scanner scanner = new Scanner(System.in);
			int x = scanner.nextInt();
			double y = scanner.nextDouble();
			
			if((x % 5 == 0) && ((y - x) >= 0.50)){
				y = y - x - 0.5;
			}
			
			System.out.println(String.format("%.2f",y));
		}
		catch(Exception e){System.out.println();}
	}
}