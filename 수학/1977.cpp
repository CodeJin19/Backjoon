#include <iostream>
#include <math.h>

using namespace std;

int main()
{
	int m, n, x, y, sum, min, num;

	cin >> m >> n;

	x = sqrt(m);
	y = sqrt(n);

	sum = 0;
	min = 2112345678;

	for (int i = y; x <= i; i--)
	{
		num = i * i;

		if (m <= num && num <= n)
		{
			sum += num;

			if (num < min)
			{
				min = num;
			}
		}
	}

	if (sum == 0)
	{
		cout << "-1\n";
	}
	else
	{
		cout << sum << "\n" << min << "\n";
	}

	return 0;
}
