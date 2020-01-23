#include <iostream>

using namespace std;

int main()
{
	double t;
	int x, y;

	cin >> t;

	t /= 2;
	t *= t;

	t *= 10;
	x = t;
	y = x % 10;
	x /= 10;

	if (5 <= y)
	{
		x += 1;
	}

	cout << x << endl;

	return 0;
}
