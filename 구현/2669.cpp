#include <iostream>

using namespace std;

int main()
{
	int fld[110][110];
	int x1, y1, x2, y2;
	int cnt = 0;

	for (int i = 0; i < 110; i++)
	{
		for (int j = 0; j < 110; j++)
		{
			fld[i][j] = 0;
		}
	}

	for (int i = 0; i < 4; i++)
	{
		cin >> x1 >> y1 >> x2 >> y2;

		for (int j = x1; j < x2; j++)
		{
			for (int k = y1; k < y2; k++)
			{
				fld[j][k] = 1;
			}
		}
	}

	for (int i = 0; i < 110; i++)
	{
		for (int j = 0; j < 110; j++)
		{
			cnt += fld[i][j];
		}
	}

	cout << cnt << endl;

	return 0;
}
