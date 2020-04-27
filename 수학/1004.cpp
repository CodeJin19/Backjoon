#include <iostream>

using namespace std;

bool isIncluded(int a, int b, int x, int y, int r)
{
	int d;

	d = (a - x) * (a - x) + (b - y) * (b - y);

	if (d <= (r * r))
		return true;
	else
		return false;
}

int main()
{
	int t, x1, y1, x2, y2, x, y, r, n, cnt;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cnt = 0;

		cin >> x1 >> y1 >> x2 >> y2 >> n;

		for (int i = 0; i < n; i++)
		{
			cin >> x >> y >> r;

			if (isIncluded(x1, y1, x, y, r))
			{
				if (!isIncluded(x2, y2, x, y, r))
					cnt++;
			}
			else
			{
				if (isIncluded(x2, y2, x, y, r))
					cnt++;
			}
		}

		cout << cnt << "\n";
	}

	return 0;
}
