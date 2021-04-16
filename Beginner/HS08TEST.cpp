#include <iostream>
using namespace std;

int main(){
	int x;
	float y;
	
	cin >> x >> y ;
	
	if((x % 5 == 0) && (y - x >= 0.5))
	{
		y = y - x - 0.50;
	}
	
	cout << y << endl;
	
	return 0;
}