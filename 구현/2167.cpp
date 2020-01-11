#include <iostream>

using namespace std;

int main()
{
	int n, m, t, x1, x2, y1, y2, sum;
	int fld[300][300];

	cin >> n >> m;

	for (int i = 0; i < n; i++)
	{
		for (int j = 0; j < m; j++)
		{
			cin >> fld[i][j];
		}
	}

	cin >> t;

	for (int itr = 0; itr < t; itr++)
	{
		cin >> x1 >> y1 >> x2 >> y2;
		sum = 0;

		for (int i = x1 - 1; i < x2; i++)
		{
			for (int j = y1 - 1; j < y2; j++)
			{
				sum += fld[i][j];
			}
		}

		cout << sum << endl;
	}

	return 0;
}
