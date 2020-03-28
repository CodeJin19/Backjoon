#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <bool> cache (10, false);
	int t, n, r, cnt;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cnt = 0;

		for (int i = 0; i < 10; i++)
			cache[i] = false;

		cin >> n;

		while (n != 0)
		{
			r = n % 10;
			n /= 10;

			cache[r] = true;
		}

		for (int i = 0; i < 10; i++)
			if (cache[i])
				cnt++;

		cout << cnt << "\n";
	}

	return 0;
}
