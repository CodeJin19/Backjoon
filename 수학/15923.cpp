#include <iostream>

using namespace std;

int main()
{
	int n, x, y, maxx = -1, maxy = -1, minx = 100, miny = 100;

	cin >> n;

	for (int i = 0; i < n; i++)
	{
		cin >> x >> y;

		if (x < minx)
		{
			minx = x;
		}

		if (maxx < x)
		{
			maxx = x;
		}

		if (y < miny)
		{
			miny = y;
		}

		if (maxy < y)
		{
			maxy = y;
		}
	}

	cout << 2 * ((maxx - minx) + (maxy - miny)) << endl;

	return 0;
}
