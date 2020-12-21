#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector <bool> xCache, yCache;
	int n, m, x, y;
	char c;

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		yCache.push_back(false);
	}

	for (int i = 0; i < m; i++)
	{
		xCache.push_back(false);
	}

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < m; j++)
		{
			cin >> c;

			if (c == 'X')
			{
				yCache[i] = true;
				xCache[j] = true;
			}
		}
	}

	y = n;

	for (int i = 0; i < n; i++)
	{
		if (yCache[i])
		{
			y--;
		}
	}

	x = m;

	for (int i = 0; i < m; i++)
	{
		if (xCache[i])
		{
			x--;
		}
	}

	if (x < y)
	{
		cout << y << endl;
	}
	else
	{
		cout << x << endl;
	}

	return 0;
}
