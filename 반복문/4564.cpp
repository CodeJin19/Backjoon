#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int n, next;
	vector <int> cache;

	cin >> n;

	while (n != 0)
	{
		cache.clear();
		cache.push_back(n);

		while (10 <= n)
		{
			next = 1;

			while (n != 0)
			{
				next *= (n % 10);
				n /= 10;
			}

			cache.push_back(next);
			n = next;
		}

		for (int i = 0; i < cache.size(); i++)
		{
			cout << cache[i] << " ";
		}
		cout << endl;

		cin >> n;
	}

	return 0;
}
