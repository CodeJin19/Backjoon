#include <iostream>

using namespace std;

int main()
{
	int n, x;
	int mul = 2;
	int add = 2;

	cin >> n;

	x = 3;

	for (int i = n; 1 < i; i--)
	{
		x += add;
		add *= mul;
	}
    
	cout << x * x << endl;

	return 0;
}
