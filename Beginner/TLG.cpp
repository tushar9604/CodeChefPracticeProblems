#include <iostream>
#include <bits/stdc++.h>
using namespace std; 

int main(){
	
	long long t;
	cin >> t;
	long long player1=0,player2=0,lead=0,leader=0;
	long long x,y;
	
	for(long long i=0;i<t;i++){
		cin >> x >> y;
		player1 += x;
		player2 += y;
		if(player1 > player2){
			if((player1-player2)>lead){
				lead = (player1 - player2);
				leader = 1;
			}
		}
			else{
				if((player2-player1)>lead){
					lead = (player2 - player1);
					leader = 2;
				}
			}
	}
	cout << leader << " " << lead << endl;
	
	
	return 0;
}