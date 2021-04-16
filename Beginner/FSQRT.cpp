#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
	
	int t;
	cin >> t;
	int n;
	
	for(int i=0;i<t;i++){
		int root = 1;
		cin >> n;
		
		while((root+1)*(root+1)<=n){
			root += 1;
		}
		cout << root << endl;
	}
	return 0;
}