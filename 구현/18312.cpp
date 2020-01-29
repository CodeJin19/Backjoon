#include <iostream>

using namespace std;

bool check(int n, int k)
{
	if (n % 10 == k)
	{
		return true;
	}
	else
	{
		n /= 10;

		if (n == k)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

int main()
{
	int n, k, cnt = 0;

	cin >> n >> k;

	for (int h = 0; h <= n; h++)
	{
		if (check(h, k))
		{
			cnt += 3600;
		}
		else
		{
			for (int m = 0; m < 60; m++)
			{
				if (check(m, k))
				{
					cnt += 60;
				}
				else
				{
					for (int s = 0; s < 60; s++)
					{
						if (check(s, k))
						{
							cnt++;
						}
					}
				}
			}
		}
	}

	cout << cnt << endl;

	return 0;
}
