#include <iostream>

using namespace std;

int main()
{
	int n, m, x, y, t, cnt;

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> n >> m;
		
		cnt = 0;

		for (int i = 1; i < n; i++)
		{
			for (int j = i + 1; j < n; j++)
			{
				x = (i * i) + (j * j) + m;
				y = x;
				x /= (i * j);
				x *= (i * j);

				if (x == y)
				{
					cnt++;
				}
			}
		}

		cout << cnt << "\n";
	}

	return 0;
}
