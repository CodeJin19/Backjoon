#include <iostream>

using namespace std;

int main()
{
	int fld[110][110];
	int T, x, y, sum;

	cin >> T;

	for (int i = 0; i < 110; i++)  //fld 초기화
	{
		for (int j = 0; j < 110; j++)
		{
			fld[i][j] = 0;
		}
	}

	for (int itr = 0; itr < T; itr++)  //
	{
		cin >> x >> y;

		for (int i = x; i < x + 10; i++)
		{
			for (int j = y; j < y + 10; j++)
			{
				fld[i][j] = 1;
			}
		}
	}

	sum = 0;

	for (int i = 0; i < 110; i++)
	{
		for (int j = 0; j < 110; j++)
		{
			sum += fld[i][j];
		}
	}

	cout << sum << endl;

	return 0;
}
