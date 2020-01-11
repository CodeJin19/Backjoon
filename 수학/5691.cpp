#include <iostream>

using namespace std;

int main()
{
	int a, b, c;

	cin >> a >> b;

	while (a != 0 && b != 0)
	{
		if (a < b)
		{
			c = a * 3;
			c -= a;
			c -= b;
		}
		else
		{
			c = b * 3;
			c -= a;
			c -= b;
		}

		cout << c << endl;

		cin >> a >> b;
	}

	return 0;
}
