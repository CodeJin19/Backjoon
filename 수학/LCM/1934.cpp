#include <iostream>

using namespace std;

int lcm(int x, int y)
{
	int a, b, r, ret;

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

	ret = y / b;
	ret *= x;

	return ret;
}

int main()
{
	int t, a, b;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> a >> b;

		cout << lcm(a, b) << "\n";
	}

	return 0;
}
