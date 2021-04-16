#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
	long t;
	
	cin >> t;
	long long n;
	
	for(long i=0;i<t;i++){
	    cin >> n;
		int count = 0;
		
		while(n>0){
			int rem = n%10;
			
			if(rem == 4){
				count++;
			}
			n /= 10;
		}
		cout << count << endl;
				
	}	
	return 0;
}