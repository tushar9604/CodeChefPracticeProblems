import java.io.*;
import java.util.*;
import java.lang.*;
import java.lang.Math;

class CodeChef {
	
	public static void main(String[] args) throws java.lang.Exception {
		
		try{
			Scanner scanner = new Scanner(System.in);
			int t = scanner.nextInt();
			scanner.nextLine();
			
			for(int i=0;i<t;i++){
				int root = 1;
				int n = scanner.nextInt();
				while((root+1)*(root+1)<=n){
					root += 1;
				}
				System.out.println(root);
			}
		} catch (java.lang.Exception e){}
	}
}