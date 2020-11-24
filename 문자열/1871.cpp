#include <iostream>
#include <string>
#include <math.h>

using namespace std;

int main()
{
	string s;
	int n, x, y, digit, tmp;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> s;

		x = 0;
		y = 0;
		digit = 26 * 26;

		for (int j = 0; j < 3; j++)
		{
			tmp = (int)(s[j] - 'A');
			x += (tmp * digit);
			digit /= 26;
		}

		for (int j = 0; j < 4; j++)
		{
			y *= 10;
			tmp = (int)(s[4 + j] - '0');
			y += tmp;
		}

		if (abs(x - y) <= 100)
		{
			cout << "nice\n";
		}
		else
		{
			cout << "not nice\n";
		}
	}

	return 0;
}
