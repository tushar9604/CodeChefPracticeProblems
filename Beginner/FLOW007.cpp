#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
	
	int t;
	cin >> t;
	long n;
	long rem;
	for(int i=0;i<t;i++){
		cin >> n;
		rem = 0;
		
		while(n>0){
			rem = rem*10 + n%10;
			n = n/10;
		}
		cout << rem << endl;
		
	}
	
	return 0;
}