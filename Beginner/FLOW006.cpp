#include <iostream>
using namespace std;

int main(){
	int t,num,sum,rem,tens;
	
	cin >> t;
	
	for(int i=0;i<t;i++){
		cin >> num;
		sum = 0;
		rem = 0;
		tens = 10;
		while(num !=0){
			rem = num%tens;
			num /= tens;
			sum += rem;
		}
		cout << sum << endl;
	}
	
	return 0;
}