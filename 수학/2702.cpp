#include <iostream>

using namespace std;

int gcd(int x, int y)
{
	int a, b, r;

	if (x < y)
	{
		a = y;
		b = x;
	}
	else
	{
		a = x;
		b = y;
	}

	r = a % b;

	while (r != 0)
	{
		a = b;
		b = r;
		r = a % b;
	}

	return b;
}

int main()
{
	int t, x, y, g;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> x >> y;

		g = gcd(x, y);

		cout << x / g * y << " " << g << endl;
	}

	cin >> t;

	return 0;
}
