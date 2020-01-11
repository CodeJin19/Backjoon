#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <int> triangle;
	vector <int> cache;
	int t, n, idx = 1;

	triangle.push_back(1);
	cache.push_back(0);

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> n;

		if (n < idx)
		{
			cout << cache[n] << endl;
		}
		else
		{
			while (idx <= n)
			{
				triangle.push_back(triangle[idx - 1] + idx + 1);
				cache.push_back(idx * triangle[idx] + cache[idx - 1]);
				idx++;
			}

			cout << cache[n] << endl;
		}
	}

	return 0;
}
