#include <iostream>

using namespace std;

int main()
{
	int p, k, n, x, cnt, sum;

	cin >> p;

	for (int itr = 0; itr < p; itr++)
	{
		sum = 0;
		cnt = 0;

		cin >> k >> n;

		x = n * (n + 1);
		x /= 2;

		cout << k << " " << x << " ";

		for (int i = 1; cnt < n; cnt++)
		{
			sum += i;
			i += 2;
		}

		cout << sum << " " << sum + n << "\n";
	}

	return 0;
}
