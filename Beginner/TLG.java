import java.io.*;
import java.util.*;
import java.lang.*;

class CodeChef{
	
	public static void main(String[] args){
			Scanner scanner = new Scanner(System.in);
			int t = scanner.nextInt();
			int player1=0;
			int player2=0;
			int lead=0;
			int leader=0;
			
			for(int i=0;i<t;i++){
				int x = scanner.nextInt();
				int y = scanner.nextInt();
				
				player1 += x;
				player2 += y;
				
				if(player1 > player2)
				{
					if((player1 - player2) > lead){
						lead = (player1 - player2);
						leader = 1;
					}
				}
				else{
					if((player2 - player1) > lead){
						lead = (player2 - player1);
						leader = 2;
					}
				}						
			}
			
			System.out.println(leader + " " + lead);
			
	}
}