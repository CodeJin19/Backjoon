#include <iostream>

using namespace std;

int getMax(int x, int y, int z)
{
	if (x < y)
		if (y < z)
			return z;
		else
			return y;
	else
		if (x < z)
			return z;
		else
			return x;
}

int main()
{
	int n, max = -2100000000, a, b, c, price;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> a >> b >> c;

		if (a == b && b == c)
			price = 10000 + (a * 1000);
		else if (a == b || a == c)
			price = 1000 + (a * 100);
		else if (b == c)
			price = 1000 + (b * 100);
		else
			price = getMax(a, b, c) * 100;

		if (max < price)
			max = price;
	}

	cout << max << endl;

	return 0;
}
