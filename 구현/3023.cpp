#include <iostream>

using namespace std;

int main()
{
	int r, c, x, y;
	char fld[105][105];

	cin >> r >> c;

	for (int i = 1; i <= r; i++)
	{
		for (int j = 1; j <= c; j++)
		{
			cin >> fld[i][j];

			//대칭상 만들기
			fld[i][c + c + 1 - j] = fld[i][j];
			fld[r + r + 1 - i][j] = fld[i][j];
			fld[r + r + 1 - i][c + c + 1 - j] = fld[i][j];
		}
	}

	cin >> x >> y;

	if (fld[x][y] == '.')
	{
		fld[x][y] = '#';
	}
	else
	{
		fld[x][y] = '.';
	}

	for (int i = 1; i <= 2 * r; i++)
	{
		for (int j = 1; j <= 2 * c; j++)
		{
			cout << fld[i][j];
		}
		cout << "\n";
	}

	return 0;
}
