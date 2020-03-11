#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <long long> cache;
	int t, n;
    long long x, y;

	cin >> t;

	cache.push_back(0);
	cache.push_back(1);
	cache.push_back(1);
	cache.push_back(1);
	cache.push_back(2);
	cache.push_back(2);

	for (int itr = 0; itr < t; itr++)
	{
		cin >> n;

		if (n < cache.size())
			cout << cache[n] << "\n";
		else
		{
			for (int i = n - cache.size(); 0 <= i; i--)
			{
				x = cache[cache.size() - 1];
				y = cache[cache.size() - 5];

				cache.push_back(x + y);
			}

			cout << cache[n] << "\n";
		}
	}

	return 0;
}
