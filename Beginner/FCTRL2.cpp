#include <bits/stdc++.h>
#include <iostream>
#include <boost/multiprecision/cpp_int.hpp>
using namespace boost::multiprecision;
using namespace std;

int main(){
	int t,num;
	cin >> t;
	long long fact;
	
	for(int i=0;i<t;i++){
		cin >> num ;
		cpp_int fact=1;
		
		while(num > 0){
			fact *= num;
			num--;
		}
		
		cout << fact << endl;
	}
	
	return 0;
}

/*

#include<bits/stdc++.h>
#define ll  long long int
#define mod 998244353
#define fr(a,b) for(ll i=a;i<b;i++)
#define fast ios_base::sync_with_stdio(false); cin.tie(NULL);cout.tie(NULL);
#define test ll t; cin>>t; while(t--)
#define pb push_back
#define all(x) (x).begin(),(x).end()
#pragma GCC optimize("Ofast")
#pragma GCC target("avx,avx2,fma")
using namespace std;
string s;
void mul(string &s2)
{
	string s1;
s1=s;
s="";
	ll n,m,i,j,c=0,d;
	n=s1.length();
	m=s2.length();
	reverse(all(s1));
	reverse(all(s2));
	ll a[5*(n+m)]={0};
	memset(a,0,sizeof a);
	for(i=0;i<n;i++)
	{
		for(j=0;j<m;j++)
		{
			a[i+j]+=(s1[i]-'0')*(s2[j]-'0');
		}
	}
	for(i=0;i<2*(n+m);i++)
	{
	  d=c+a[i];
	  d%=10;
	  s+=d+'0';
	  c=(c+a[i])/10;
	}
	while(s.back()=='0')
	s.pop_back();
	reverse(all(s));
}
int main()
{
fast;
test
{
ll n,i,p;
cin>>n;
s="1";
string str;
for(i=2;i<=n;i++)
{
	p=i;
str="";
	while(p)
	{
		str+=(p%10)+'0';
		p/=10;
	}
	reverse(all(str));
	mul(str);
}
//cout<<s.length()<<' ';
cout<<s;
cout<<'\n';	
}
    return 0;
}
*/