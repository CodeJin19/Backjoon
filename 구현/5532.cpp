#include <iostream>

using namespace std;

int main()
{
	int l, a, b, c, d, x, y;

	cin >> l >> a >> b >> c >> d;

	x = a / c;

	if (a % c != 0)
	{
		x++;
	}

	y = b / d;

	if (b % d != 0)
	{
		y++;
	}

	if (x < y)
	{
		cout << l - y << endl;
	}
	else
	{
		cout << l - x << endl;
	}

	return 0;
}
