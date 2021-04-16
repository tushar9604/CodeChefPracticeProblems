#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
	int t;
	cin >> t;
	long n;
	
	for(int i=0;i<t;i++){
		cin >> n;
		
		int last_digit = n%10;
		int first_digit;
		long rem = n;
		long tens = 1000000; 
		while(n == rem){
			first_digit = n/tens;
			rem = n%tens;
			tens /= 10;
		}
		int output = first_digit+last_digit;
		cout << output << endl;
	}
	
	return 0;
}