#include <iostream>

using namespace std;

int main()
{
	int n, sum = 0, x = 1, a, b;

	cin >> n;

	while (sum < n)
	{
		sum += x;
		x++;
	}
	
	x--;
	sum -= x;

	b = n - sum;
	a = x - b + 1;

	cout << a << " " << b << endl;

	return 0;
}
