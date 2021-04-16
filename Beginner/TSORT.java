import java.lang.*;
import java.util.*;
import java.io.*;


class CodeChef{
	
	public static void main(String[] args) throws java.lang.Exception {
		
		try{
			Scanner scanner = new Scanner(System.in);
			
			int t = scanner.nextInt();
			int temp;
			
			ArrayList<Integer> l = new ArrayList<Integer>();
			
			for(int i=0;i<t;i++){
				l.add(scanner.nextInt());
			}
			
			Collections.sort(l);
			
			for(int ii: l){
				System.out.println(ii);
			}
			
			//System.out.println(l);
		} catch (java.lang.Exception e){}
	}
}
			