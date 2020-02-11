#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int n, idx;
	vector <bool> cache;
	vector <int> prime;

	cin >> n;

	for (int i = 0; i <= n; i++)
	{
		cache.push_back(true);
	}

	for (int i = 2; i <= n; i++)
	{
		if (cache[i])
		{
			prime.push_back(i);

			for (int j = i + i; j <= n;)
			{
				cache[j] = false;
				j += i;
			}
		}
	}

	while (n != 1)
	{
		idx = 0;

		while (n % prime[idx] != 0)
		{
			idx++;
		}

		cout << prime[idx] << "\n";
		n /= prime[idx];
	}
	
	return 0;
}
