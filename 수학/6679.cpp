#include <iostream>

using namespace std;

int main()
{
	int a, b, c, n;

	for (int i = 1000; i < 10000; i++)
	{
		a = 0;
		b = 0;
		c = 0;
		n = i;

		while (n != 0)
		{
			a += (n % 10);
			n /= 10;
		}

		n = i;

		while (n != 0)
		{
			b += (n % 12);
			n /= 12;
		}

		n = i;

		while (n != 0)
		{
			c += (n % 16);
			n /= 16;
		}

		if (a == b && b == c)
		{
			cout << i << "\n";
		}
	}

	return 0;
}
