#include <iostream>

using namespace std;

int main()
{
	string a, b;
	int len, x, y, digit, tmp;
	bool flag;

	cin >> a >> b;

	len = a.length();
	x = 0;
	
	for (int i = len - 1; 0 <= i; i--)
	{
		tmp = (int)(a[i] - '0');
		x *= 10;
		x += tmp;
	}

	len = b.length();
	y = 0;

	for (int i = len - 1; 0 <= i; i--)
	{
		tmp = (int)(b[i] - '0');
		y *= 10;
		y += tmp;
	}

	tmp = x + y;
	x = 0;

	while (tmp != 0)
	{
		x *= 10;
		x += (tmp % 10);
		tmp /= 10;
	}

	cout << x << endl;

	return 0;
}
