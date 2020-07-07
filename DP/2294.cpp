#include <iostream>
#include <vector>

using namespace std;

int getMin(int x, int y)
{
	if (x < y)
	{
		return x;
	}
	else
	{
		return y;
	}
}

int main()
{
	vector <int> coin;
	int n, x, k, min;

	cin >> n >> k;

	for (int i = 0; i <= k; i++)
	{
		coin.push_back(-1);
	}

	for (int i = 0; i < n; i++)
	{
		cin >> x;

		if (x <= k)
		{
			coin[x] = 1;
		}
	}

	for (int i = 2; i <= k; i++)
	{
		min = 2112345678;

		if (coin[i] != 1)
		{
			for (int j = 1; j <= i / 2; j++)
			{
				if (coin[j] != -1 && coin[i - j] != -1)
				{
					x = coin[j] + coin[i - j];

					if (0 < x)
					{
						min = getMin(min, x);
					}
				}
			}

			if (min == 2112345678)
			{
				coin[i] = -1;
			}
			else
			{
				coin[i] = min;
			}
		}
	}

	cout << coin[k] << endl;

	return 0;
}
