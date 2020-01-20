#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> cache;
	int n, x;

	cache.push_back(0);
	cache.push_back(1);

	cin >> n;

	if (n < cache.size())
	{
		cout << cache[n] << endl;
	}
	else
	{
		for (int i = cache.size(); i <= n; i++)
		{
			x = cache[i - 1] + cache[i - 2];
			x %= 1000000007;
			cache.push_back(x);
		}

		cout << cache[n] << endl;
	}

	return 0;
}
