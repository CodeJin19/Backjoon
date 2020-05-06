#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	vector <int> A;
	vector <int> cache;
	int n, x, itr;
	bool flag;

	A.push_back(1);
	A.push_back(1);

	cin >> n;

	if ((A.size() - 1) < n)
	{
		for (int i = A.size(); i <= n; i++)
		{
			cache.clear();

			for (int k = 1; k <= (i / 2); k++)
			{
				x = (A[i - k] * 2) - A[i - (2 * k)];

				if (0 < x)
				{
					flag = true;

					for (int j = 0; j < cache.size(); j++)
					{
						if (cache[j] == x)
						{
							flag = false;
							break;
						}
					}

					if (flag)
						cache.push_back(x);
				}
					
			}

			sort(cache.begin(), cache.end());

			x = 1;
			itr = 0;

			while (itr < cache.size() &&  cache[itr] == x)
			{
				itr++;
				x++;
			}

			A.push_back(x);
		}
	}

	cout << A[n] << endl;

	return 0;
}
