import java.io.*;
import java.util.*;

class CodeChef{
	
	public static void main(Strin[] args){
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<t;i++){
			int a,b;
			a = scanner.nextInt();
			b = scanner.nextInt();
			System.out.println(a%b);
		}
	}
}