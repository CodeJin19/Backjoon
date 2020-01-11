#include <iostream>
#include <math.h>

using namespace std;

int main()
{
	int c, k, r, x;

	cin >> c >> k;

	x = pow(10, k);

	r = c % x;

	if (r < x / 2)
	{
		cout << c - r << endl;
	}
	else
	{
		cout << c - r + x << endl;
	}

	return 0;
}
