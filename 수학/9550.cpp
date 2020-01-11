#include <iostream>

using namespace std;

int main()
{
	int t, n, k, x, y, sum;

	cin >> t;

	for (int i = 0; i < t; i++)
	{
		cin >> n >> k;
		sum = 0;

		for (int j = 0; j < n; j++)
		{
			cin >> x;

			if (k <= x)
			{
				x /= k;
				sum += x;
			}
		}

		cout << sum << "\n";
	}

	return 0;
}
