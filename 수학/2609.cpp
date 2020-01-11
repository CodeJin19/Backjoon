#include <iostream>

using namespace std;

int main()
{
	int a, b, x, y, r;

	cin >> a >> b;

	if (a <= b)
	{
		y = b;
		x = a;
	}
	else
	{
		y = a;
		x = b;
	}

	r = y % x;

	while (r != 0)
	{
		y = x;
		x = r;
		r = y % x;
	}

	cout << x << endl << a / x * b << endl;

	return 0;
}
