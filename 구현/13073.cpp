#include <iostream>

using namespace std;

int main()
{
	int t, n, x, cnt, sum;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		sum = 0;
		cnt = 0;

		cin >> n;

		x = n * (n + 1);
		x /= 2;

		cout << x << " ";

		for (int i = 1; cnt < n; cnt++)
		{
			sum += i;
			i += 2;
		}

		cout << sum << " " << sum + n << "\n";
	}

	return 0;
}
